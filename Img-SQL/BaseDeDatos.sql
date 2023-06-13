CREATE DATABASE Biblioteca

USE Biblioteca

create table Cliente(
IDCliente  int primary key not null,
NombreCliente varchar(50) not null,
Email varchar(50) not null,
NumeroTelCli   varchar(50) not null
)

Create table Bibliotecario(
IDBibliotecario int primary key not null,
Nombre varchar(50) not null,
Email  varchar(50) not null,
Direccion varchar(50) not null,
NumTel varchar(50),
Turno  varchar(50),
Contra varchar(50),
AdminRol INT not null
)

create table Libros(
ISBN  bigint primary key not null,
FechaPublicacion date,
Edicion varchar(50) not null,
NombreLibro varchar(50) not null,
Cant int,
Paginas int,
Editorial varchar(50) not null,
Genero varchar(50) not null,
Autor varchar(100) not null
)

create table Inventario(
ISBN bigint primary key not null,
constraint FK_InventarioISBN foreign key (ISBN) references Libros (ISBN)
)

create table Multa(
IDMulta int primary key not null,
CostoMulta money
)

create table Proveedores(
IDProveedor int primary key not null,
Nombre varchar(50) not null,
Email varchar (50) not null,
NumTel varchar(50) -- Cambiado a varchar para ser consistente con las otras tablas
)

create table FacturaProveedor(
IDFactura int primary key not null, -- Cambiado a IDFactura para ser más descriptivo
ISBN bigint,
IDProveedor int,
costo money,
cantidad int,
constraint FK_FacturaProveedor_Proveedor foreign key (IDProveedor) references Proveedores(IDProveedor),
constraint FK_FacturaProveedor_ISBN foreign key (ISBN) references Libros(ISBN)
)

create table PrestamoLibros(
IDPrestamo bigint primary key not null,
ISBN bigint,
IDCliente int,
IDBibliotecario int,
FechaPrestamo DATE,
FechaDevolucion DATE,
IDMulta int,
constraint FK_PrestamoLibros_ISBN foreign key (ISBN) references Libros(ISBN),
constraint FK_PrestamoLibros_Cliente foreign key (IDCliente) references cliente(IDCliente),
constraint FK_PrestamoLibros_Bibliotecario foreign key (IDBibliotecario) references Bibliotecario(IDBibliotecario),
constraint FK_PrestamoLibros_Multa foreign key (IDMulta) references multa(IDMulta)
)
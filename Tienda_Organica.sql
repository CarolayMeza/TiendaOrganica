create database Tienda_Organica;

use Tienda_organica;

create table Clientes(
Cedula varchar(10) primary key,
direccion_cliente varchar(30)not null,
email_cliente varchar(50) ,
nombre_cliente varchar(25) not null,
telefonono_cliente varchar(10) 
);

create table Usuarios(
cedula_usuario varchar(10) primary key,
email_usuario varchar (50),
nombre_usuario varchar (25) not null,
password varchar(30) not null,
usuario varchar(30) not null
);

create table Ventas(
codigo_venta bigint(20) auto_increment primary key,
Cedula varchar(25) not null,
cedula_usuario varchar (25) not null,
ivaventa double not null,
total_venta double not null,
valor_venta double not null
);

alter table Ventas add foreign key (Cedula) references Clientes (Cedula);
alter table Ventas add foreign key (cedula_usuario) references Usuarios(cedula_usuario);

create table Detalle_ventas(
codigo_detalle_venta bigint(20) primary key,
cantidad_producto int(11) not null,
codigo_producto bigint(20),
codigo_venta bigint(20),
valor_total double not null,
valor_venta double not null,
valoriva double not null
);
alter table Detalle_ventas add foreign key (codigo_producto) references Productos(codigo_producto);
alter table Detalle_ventas add foreign key (codigo_venta) references Ventas(codigo_venta);

create table Productos(
codigo_producto bigint(20) primary key,
ivacompra double not null,
nitproveedor bigint(20),
nombre_producto varchar(40)not null,
precio_compra double not null,
precio_venta double not null
);

alter table Productos add foreign key (nitproveedor) references Proveedores(nitproveedor);

create table Proveedores(
nitproveedor bigint(20) primary key,
ciudad_proveedor varchar(50) not null,
direccion_proveedor varchar(50) not null,
nombre_proveedor varchar(30) not null,
telefono_proveedor varchar(30) not null
);
        #drop database Cafeteria;
        create database if not exists Cafeteria;
        use Cafeteria;
        
        create table if not exists Cliente(
        ID_cliente int not null,
        Cedula int (10) not null,
        Nombre char(50) not null,
        Apellido char(50) not null,
        telefono int (10) not null,
        Observacion char(90),
        primary key(ID_cliente))
        ENGINE = InnoDB;
        
  SET SQL_SAFE_UPDATES = 0;
		create table if not exists Empleado(
        ID_Empleado int not null,
        Nombre char(50) not null,
        Apellido char(50) not null,
        Cargo char(50) not null,
        Sueldo int not null,
        primary key(ID_empleado))
        ENGINE = InnoDB;
        

        
		create table if not exists Producto(
        ID_Producto int not null,
        Producto char(50) not null,
        Precio  double,
        Cantidad int,
        Caducidad char(20) not null,
        Proveedor char(20) not null,
        primary key(ID_producto)
        )ENGINE = InnoDB;
        
  
       create table if not exists Factura(
       ID_Factura int not null,
       ID_Producto int not null,
       ID_Cliente int not null,
       ID_Empleado int not null,
       primary key(ID_Factura),
       CONSTRAINT fk_Pr foreign key (ID_PRODUCTO) REFERENCES PRODUCTO (ID_PRODUCTO),
       CONSTRAINT fk_Cl foreign key (ID_Cliente) REFERENCES Cliente (ID_Cliente),
       CONSTRAINT fk_Emp foreign key (ID_Empleado) REFERENCES Empleado (ID_Empleado)
       
       )ENGINE = InnoDB;
        

        

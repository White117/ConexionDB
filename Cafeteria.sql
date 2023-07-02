        # drop database Cafeteria;
        create database if not exists Cafeteria;
        use Cafeteria;
        
        create table if not exists Cliente(
        ID_cliente int not null,
        Cedula int (10) not null,
        Nombre char(50) not null,
        Apellido char(50) not null,
        telefono int (10) not null,
        observación char(90),
        primary key(ID_cliente))
        ENGINE = InnoDB;
        
  SET SQL_SAFE_UPDATES = 0;
  
		create table if not exists Empleado(
        ID_empleado int not null,
        Nombre char(50) not null,
        Apellido char(50) not null,
        Cargo char(50) not null,
        primary key(ID_empleado))
        ENGINE = InnoDB;
        
        
		create table if not exists Producto(
        ID_producto int not null,
        producto char(50) not null,
        precio  double,
        cantidad int,
        caducidad date not null,
        proveedor char(20) not null,
        primary key(ID_producto)
        )ENGINE = InnoDB;
        
       
        

        

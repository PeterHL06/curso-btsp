-- Crear la tabla para almacenar datos de usuarios
CREATE TABLE usuarios
(
    id_usuario SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(255) UNIQUE,
    telefono VARCHAR(15),
    fecha_nacimiento DATE
);
-- Crear la tabla para almacenar usuarios y contraseñas
CREATE TABLE credenciales
(
    id_credencial SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL,
    username VARCHAR(50) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario)
);


CREATE TABLE puestos_trabajo (
    id_puesto SERIAL PRIMARY KEY,
    nombre_puesto VARCHAR(100) NOT NULL,
    descripcion TEXT
);

ALTER TABLE usuarios
ADD COLUMN id_puesto INT;




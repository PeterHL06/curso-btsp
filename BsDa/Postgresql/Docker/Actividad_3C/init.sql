-- init.sql

-- Crear el rol admin con contraseña
CREATE ROLE admin WITH LOGIN PASSWORD 'admin123';

-- Crear la base de datos y asignar el propietario
CREATE DATABASE credenciales WITH OWNER admin;

\connect credenciales;

-- Crear la tabla para almacenar datos de usuarios
CREATE TABLE credenciales
(
    id_usuario SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(255) UNIQUE,
    telefono VARCHAR(15),
    fecha_nacimiento DATE
);
-- Crear la tabla para almacenar usuarios y contraseñas
CREATE TABLE usuarios 
(
    id_credencial SERIAL PRIMARY KEY,
    id_usuario INT NOT NULL,
    username VARCHAR(50) UNIQUE NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario)
);

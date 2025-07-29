/*
    \l
    \c nombreBD
*/
--CREATE DATEBASE nombreDB

CREATE TABLE estudiantes{
    matricula TEXT PRIMARY KEY,
    nombre TEXT,
    edad INTEGER NOT NULL CHECK (edad >=18),
    fecha_alta DATE DEFAULT CURRENT_DATE,
    sancionado BOOLEAN DEFAULT FALSE
};

ALTER TABLE estudiantes
ADD COLUMN carrera TEXT;

ALTER TABLE estudiantes
RENAME COLUMN nombre TO 
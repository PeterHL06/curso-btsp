CREATE TABLE alumnos{
    matricula TEXT PRIMARY KEY,
    nombre_completo TEXT,
    edad INTEGER NOT NULL CHECK (edad >=18)
};
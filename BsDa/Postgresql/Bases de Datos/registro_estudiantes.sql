CREATE TABLE estudiantes{
    matricula TEXT PRIMARY KEY,
    nombre TEXT,
    edad INTEGER NOT NULL CHECK (edad >=18),
    fecha_alta DATE DEFAULT CURRENT_DATE,
    sancionado BOOLEAN DEFAULT FALSE
};


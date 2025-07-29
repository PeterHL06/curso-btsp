CREATE TABLE alumnos{
    matricula TEXT PRIMARY KEY,
    nombre_completo TEXT,
    edad INTEGER NOT NULL CHECK (edad >=18),
    fecha_alta DATE DEFAULT CURRENT_DATE,
    sancionado BOOLEAN DEFAULT FALSE,
    carrera TEXT
};


INSERT alumnos(
    matricula, nombre_completo, edad, fecha_alta, sancionado, carrera
)
values(
    'A001','Pedro Hurtado',40,'Electrónica'
)
/*
    INSERT --> Insertar elementos en la base de datos /tabla
    UPDATE --> Actualizar los elementos dentro de una tabla
    DELETE --> Eliminar los elementos dentro de una tabla
    Modificaciones permanentes !!

*/

-- INSERT INTO tabla() values ();

INSERT alumnos(
    matricula, nombre_completo, edad, fecha_alta, sancionado, carrera
);
values(
    'A070', 'Cristina Colín Ayala', 25, '2025-07-24', TRUE, 'Matemáticas',
    'A060','Pedro Hurtado López',40,'2025-07-24', TRUE, 'Electrónica'
);


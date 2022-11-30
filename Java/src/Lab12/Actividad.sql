CREATE TABLE cursos
(
 idCurso integer(5) PRIMARY KEY,
 descripcion char(40) NOT NULL,
 credito integer (5)
);

SELECT * FROM actividad_01.cursos;

INSERT INTO cursos
(idCurso, descripcion, credito)
VALUES
(1, 'Lenguaje de programacion', 5),
(2, 'Sistemas de informacion', 4),
(3, 'Computacion en red', 4),
(4, 'Fisica', 3),
(5, 'Responsabilidad Ciudadana', 2),
(6, 'Taller de argumentacion', 1);

SELECT * FROM actividad_01.cursos WHERE credito>4;

UPDATE cursos
SET descripcion = "Calculo Integral"
WHERE idCurso = 4;

DELETE FROM cursos WHERE credito =1;

select num_letras('a');

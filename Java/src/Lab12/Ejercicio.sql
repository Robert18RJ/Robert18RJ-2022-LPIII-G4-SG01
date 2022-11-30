CREATE TABLE agenda
(
 idAddress integer(5) PRIMARY KEY,
 firstName char(40) NOT NULL,
 lastName char(40) NOT NULL,
 email char(40) NOT NULL,
 phoneNumber integer (9)
);

INSERT INTO agenda
(idAddress, firstName, lastName, email, phoneNumber)
VALUES
(1, 'Robert','Dueñas','rj.d.18@hotmail.com',947398833),
(2, 'Jaely','Zavala','jaely_10@hotmail.com',957398844),
(3, 'Carlos','Llerena','Carlos_20@hotmail.com',987398855),
(4, 'Luis','Rodriguez','Luchito_69@hotmail.com',967391458),
(5, 'Pepe','Perez','Pepito_1807@hotmail.com',915826147);

SELECT * FROM agenda;
INSERT INTO alumnos (nombre,apellido,email,telefono,curso) VALUES('Juan Miguel','Díaz','jmd@hotmail.com',611222555,'dam');
INSERT INTO alumnos (nombre,apellido,email,telefono,curso) VALUES('Flor','Rus','fr@hotmail.com',62233223,'daw');
INSERT INTO alumnos (nombre,apellido,email,telefono,curso) VALUES('Brenda','Solorzano','bs@hotmail.com',63333224,'dam');
INSERT INTO alumnos (nombre,apellido,email,telefono,curso) VALUES('Ruben','Martin','rm@hotmail.com',64433225, 'daw');

INSERT INTO `usuarios` (username,password,enabled) VALUES('juan','$2a$10$0dEFGrwJ9POX0',1);
INSERT INTO `usuarios` (username,password,enabled) VALUES('admin','$2a$10$.0mTvUXw9S/a',1);

INSERT INTO `roles` (nombre) VALUES('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id,role_id) VALUES(1,1);
INSERT INTO `usuarios_roles` (usuario_id,role_id) VALUES(2,2);
INSERT INTO `usuarios_roles` (usuario_id,role_id) VALUES(2,1);
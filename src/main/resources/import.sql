INSERT INTO cliente (id_cliente,nombre,apellido) VALUES (1,'juan','perez gutierrez');
INSERT INTO cliente (id_cliente,nombre,apellido) VALUES (2,'ruth','gonzalez illescas');
INSERT INTO cliente (id_cliente,nombre,apellido) VALUES (3,'pedro','jaime fernandez');
INSERT INTO cliente (id_cliente,nombre,apellido) VALUES (4,'jorge','luna tafur');
INSERT INTO cliente (id_cliente,nombre,apellido) VALUES (5,'andrea','reyes rondinel');

INSERT INTO usuario (id_usuario,id_cliente,username,password) VALUES (1,1,'juan','123');
INSERT INTO usuario (id_usuario,id_cliente,username,password) VALUES (2,2,'ruth','123');
INSERT INTO usuario (id_usuario,id_cliente,username,password) VALUES (3,3,'pedro','123');
INSERT INTO usuario (id_usuario,id_cliente,username,password) VALUES (4,4,'jorge','123');
INSERT INTO usuario (id_usuario,id_cliente,username,password) VALUES (5,5,'andrea','123');


INSERT INTO producto(id_producto,nombre,descripcion,precio) VALUES (1,'Blusa Manga Larga','Color negro y tela de algodon',90.00);
INSERT INTO producto(id_producto,nombre,descripcion,precio) VALUES (2,'Blusa Manga Corta','Color blanco y tela de pima',70.00);
INSERT INTO producto(id_producto,nombre,descripcion,precio) VALUES (3,'Pantalon Jeans','Color rosado',120.00);
INSERT INTO producto(id_producto,nombre,descripcion,precio) VALUES (4,'Pantalon vaquero','Color blanco',160.00);
INSERT INTO producto(id_producto,nombre,descripcion,precio) VALUES (5,'Medias doradas','Color dorado',10.00);

INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (1,1,'Recepcionado','2019-06-10',90.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (2,1,'Cancelado','2019-06-11',70.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (3,1,'Espera','2019-06-12',280.00);


INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (1,1,1,1);


INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (2,2,2,1);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (3,3,3,1);
INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (4,3,4,1);

INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (4,2,'Recepcionado','2019-06-10',90.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (5,2,'Recepcionado','2019-06-18',70.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (6,2,'Recepcionado','2019-06-19',120.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (7,2,'Cancelado','2019-06-23',70.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (8,2,'Espera','2019-06-29',200.00);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (5,4,1,1);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (6,5,2,1);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (7,6,3,1);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (8,8,5,1);
INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (9,8,2,1);
INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (10,8,3,1);

INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (9,3,'Recepcionado','2019-06-10',110.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (10,3,'Espera','2019-06-23',160.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (11,3,'Espera','2019-07-17',210.00);
INSERT INTO pedido(id_pedido,id_cliente,estado_pedido,fecha,monto_total) VALUES (12,3,'Espera','2019-07-28',80.00);


INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (11,9,5,4);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (12,9,2,2);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (13,10,4,1);

INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (14,11,3,1);
INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (15,11,1,1);
INSERT INTO detalle_pedido(id_detalle_pedido,id_pedido,id_producto,cantidad) VALUES (16,12,5,8);

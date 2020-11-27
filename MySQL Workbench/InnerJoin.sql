create database tb_categoria;
use tb_categoria;

create table tb_categoria(
idcategoria  integer primary key auto_increment,
categoria varchar (255) not null
);
insert into tb_categoria (categoria) values ("Vegana");
insert into tb_categoria (categoria) values ("Salgada");
insert into tb_categoria (categoria) values ("Doce");
insert into tb_categoria (categoria) values ("Frutos do mar");
insert into tb_categoria (categoria) values ("Massa Frita");

select*from tb_categoria;

create table tb_pizza(
idpizza  int (30) primary key auto_increment, 
idcategoria int (30),
nomeCliente varchar (30) not null,
preco double,
tamanho varchar(30),
sabor varchar(30) not null,
borda boolean,

constraint fk_categoria foreign key (idcategoria) references tb_categoria (idcategoria)
);

select*from tb_pizza;

insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Mari" , "35.99","Média","Frango c/ catupiry", true, 2);
insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Joaquim" , "48.99","Grande","Calabresa", true, 2);
insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Denis" , "55.99","Grande","Mussarela", true, 2);
insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Viih" , "29.99","Média","Brócolis", true, 1);
insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Lari" , "89.99","Pequena","Caviar", true, 4);
insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Lucas" , "27.99","Média","Chocolate c/ Morango", true, 3);
insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Daniel" , "29.99","Grande","Carne", true, 5);
insert into tb_pizza (nomeCliente, preco, tamanho, sabor, borda, idcategoria) values ("Bruno" , "89.99","Pequena","Camarão", true, 4);


select*from tb_categoria;
select*from tb_pizza
Inner join tb_categoria 
on  tb_categoria.idcategoria = tb_pizza.idcategoria ;

select*from tb_pizza where preco>45;




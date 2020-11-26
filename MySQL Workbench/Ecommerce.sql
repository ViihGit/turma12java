create database db_comercio;
use db_comercio; 

create table tb_produtos(
idproduto bigint (5) auto_increment,
nomeproduto varchar (20) not null,
descricao varchar (20),
descricao2 varchar(20),
setordeproducao varchar (20),
codigodebarras int,
valor double,
primary key (idproduto)

);

insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Picanha", "Contra-Filé", "Linguiça","Churrascaria",1234, 260.00);
insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Melão", "Mamão", "Melancia","Frutaria",3456, 500.00);
insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Bala", "Bolachas", "Biscoitos","DoceriadoB",78910, 1050.00);
insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Dorfelx", "Buscopam", "Dipirona","Farmácia",111213, 800.00);
insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Playstation", "Nintendo", "Xbox","Games",141516, 420.00);
insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Rodas", "Calotas", "Pneus","Veículos",171819, 2500.00);
insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Saia", "Vestido", "Shorts","Roupas",202122, 499.99);
insert into tb_produtos (nomeproduto, descricao, descricao2, setordeproducao, codigodebarras, valor) values ("Teclado", "Monitor", "CPU","Techtudo",232425, 890.00);
select * from tb_produtos;
select * from tb_produtos where valor >=500;
select * from tb_produtos where valor >=500;
Update tb_produtos Set valor = 1.00 where nomeproduto = "Rodas";




create database db_rh;
use db_rh;

create table tb_funcionariosDaEmpresa (
	idfuncionariosDaEmpresa  integer primary key auto_increment, 
    nome varchar (30) not null,
    sexo enum ('M','F','Outro'),
	cargo varchar (30) not null,
    salario double,
    presente boolean,
    nacionalidade varchar (20) DEFAULT 'Brasileirxs'
    );
    
    insert into tb_funcionariosDaEmpresa (nome,sexo,cargo,salario,presente,nacionalidade) values ("Vitória", "F", "Enfermagem", "2500", true, DEFAULT);
    insert into tb_funcionariosDaEmpresa (nome,sexo,cargo,salario,presente,nacionalidade) values ("Rafaela", "F", "Desenvolvedora FullStack", "5000", true, DEFAULT);
    insert into tb_funcionariosDaEmpresa (nome,sexo,cargo,salario,presente,nacionalidade) values ("Tomas", "M", "Tec.Mecatronica", "3000", true, DEFAULT);
    insert into tb_funcionariosDaEmpresa (nome,sexo,cargo,salario,presente,nacionalidade) values ("Ednirson", "M", "Contabilidade", "3700", true, DEFAULT);
    insert into tb_funcionariosDaEmpresa (nome,sexo,cargo,salario,presente,nacionalidade) values ("Fátima", "F", "Administração", "5000", true, DEFAULT);
    insert into tb_funcionariosDaEmpresa (nome,sexo,cargo,salario,presente,nacionalidade) values ("Mario", "M", "Eletricista", "7500", true, DEFAULT);
    
    select*from tb_funcionariosDaEmpresa;
    Update tb_funcionariosDaEmpresa Set salario = 25000 where nome = "Rafaela";
    truncate tb_funcionariosDaEmpresa;
    
    

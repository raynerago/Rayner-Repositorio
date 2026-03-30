USE dbHash;
BEGIN;

CREATE TABLE tbDevs (
		id int auto_increment primary key,
        nome VARCHAR(50),
        funcao VARCHAR(100),
        frase VARCHAR(100)    
);

CREATE TABLE tbTarefas (
		id int auto_increment primary key,
        nome_da_tarefa VARCHAR(100),
		tempo int,
        relevancia VARCHAR(70),
        stats VARCHAR(30)
);

CREATE TABLE tbUsuarios (
		id int auto_increment primary key,
        nome varchar(50),
        usuario varchar(70),
        senha varchar(20)
);

DROP table tbDevs;
DROP table tbUsuarios;
DROP table tbTarefas;


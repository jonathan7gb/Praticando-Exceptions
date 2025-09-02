create database GerenciadorVeiculos;
use GerenciadorVeiculos;

create table veiculos(
	codigo varchar(16) not null primary key,
    modelo varchar(200) not null,
    marca varchar(200) not null,
    anoVeiculo int not null,
    placa varchar(200) not null unique,
    tipoVeiculo enum('Carro','Caminhão','Moto','Van')
);

select * from veiculos;
describe veiculos;
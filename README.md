Desafio Java !!!

Usando Spring boot, crie uma API simples para gerenciar Pessoas. Esta API deve permitir:  
•	Criar uma pessoa
•	Editar uma pessoa
•	Consultar uma pessoa
•	Listar pessoas
•	Criar endereço para pessoa
•	Listar endereços da pessoa
•	Poder informar qual endereço é o principal da pessoa

Uma Pessoa deve ter os seguintes campos:  
•	Nome
•	Data de nascimento
•	Endereço:
o	Logradouro
o	CEP
o	Número
o	Cidade

------------------------------------------------------------------------------------------------------------
Endereço para realizar testes -> http://localhost:8080/api/v1

exemplo : http://localhost:8080/api/v1/pessoas/1

Metodos para chgar ao resultado:

POST	/pessoas	cria uma nova pessoa
PUT	/pessoas/{id}	atualiza, de forma integral, uma pessoa
GET	/pessoas	retorna lista de pessoas
GET	/pessoas/{id}	retorna uma pessoa específica
DELETE	/pessoas/{id}	deleta uma pessoa
-----------------------------------------------------------------------------------------------------------

Script para uso do método POST

{
"nomePrimeiro": "Samuel",
"nomeUltimo": "Lima",
"cpf": "380.789.778-08",
"dataNascimento": "13-11-1989",
"endereco": "rua tapajos",
"logradouro": "rua",
"cep": "07135050",
"numero": "10",
"cidade": "guarulhos",
"telefones": [
{ "tipo": "CELULAR", "numero": "(11)94043-8568" },
{ "tipo": "CASA", "numero": "(11)99354-7014" }
]
}
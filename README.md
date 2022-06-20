# Projeto-CRUD-JAVA

Projeto CRUD para A3 de Programações e Soluções Computacionais

<div align='center'>
<img src='https://user-images.githubusercontent.com/105545187/174506987-c151a821-268c-41ee-8baf-2326c4d0fb09.png'>
</div>

# Tecnologia Usada

- Java
- Mysql

# Instalação

- Biblioteca absolute layout
- Conector banco de dados MySql
- Schema no MySql chamado "java-crud"
- Tabela no MySql chamada "tb_funcionarios"

- Table = CREATE TABLE `tb_funcionarios` (
  `id` int NOT NULL,
  `nome` varchar(250) NOT NULL,
  `idade` int NOT NULL,
  `profissao` varchar(45) NOT NULL,
  `salario` double NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `imgpath` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

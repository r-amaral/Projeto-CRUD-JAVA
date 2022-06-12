# Projeto-CRUD-JAVA

Projeto crud para A3 de programações e soluções computacionais

# Tecnologia Usada

- Java
- Mysql

# Instalação

- Biblioteca absolute layout;
- Conector do banco de dados mysql;
- Schema no mysql chamado "java-crud"
- Tabela no mysql chamado "tb_funcionarios"

- Table = CREATE TABLE `tb_funcionarios` (
  `id` int NOT NULL,
  `nome` varchar(250) NOT NULL,
  `idade` int NOT NULL,
  `profissao` varchar(45) NOT NULL,
  `salario` double NOT NULL,
  `cpf` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

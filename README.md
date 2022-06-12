# Projeto-CRUD-JAVA

Projeto CRUD para A3 de Programações e Soluções Computacionais

<div align='center'>
<img src="https://user-images.githubusercontent.com/105545187/173220821-1583d618-7cbf-4ba1-b6da-cc0d79370198.png" width='900px' height='400px'>
</div>

# Tecnologia Usada

- Java
- Mysql

# Instalação

- Biblioteca absolute layout
- Conector banco de dados mysql
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

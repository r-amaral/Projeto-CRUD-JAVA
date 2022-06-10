package DAO;

import Model.Funcionario;
import com.sun.jdi.connect.spi.Connection;
import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class FuncionarioDAO {
    
    public static ArrayList<Funcionario> MinhaLista = new ArrayList<Funcionario>();

   public static int maiorID() {

       int maiorID = 0;;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
               maiorID = MinhaLista.get(i).getId();
            }
        }
        return maiorID;
    }

//    public Connection getConexao() {
//
//        Connection connection = null; //instância da conexão
//
//        try {
//// Carregamento do JDBC Driver
//            String driver = "com.mysql.cj.jdbc.Driver";
//            Class.forName(driver);
//// Configurar a conexão
//            String server = "localhost";
//            String database = "java-crud";
//            String url = "jdbc:mysql://" + server + ":3306/" + database
//                    + "?useTimezone=true&serverTimezone=UTC";
//            String user = "root";
//            String password = "ajmp141028";
//            // Conectando..
//            connection = DriverManager.getConnection(url, user, password);
//// Testando..
//            if (connection != null) {
//                System.out.println("Status: Conectado!");
//            } else {
//                System.out.println("Status: NÃO CONECTADO!");
//            }
//            return connection;
//        } catch (ClassNotFoundException e) { //Driver não encontrado
//            System.out.println("O driver nao foi encontrado.");
//            return null;
//        } catch (SQLException e) {
//            System.out.println("Nao foi possivel conectar...");
//            return null;
//        }
//    }
//
//    public ArrayList getMinhaLista() {
//        MinhaLista.clear(); // Limpa nosso ArrayList
//        try {
//            Statement stmt = this.getConexao().createStatement();
//            ResultSet res = stmt.executeQuery("SELECT * FROM java-crud");
//            while (res.next()) {
//                String profissao = res.getString("profissao");
//                double salario = res.getDouble("salario");
//                int id = res.getInt("id");
//                String nome = res.getString("nome");
//                int idade = res.getInt("idade");
//                String cpf = res.getString("cpf");
//                Funcionario objeto = new Funcionario(profissao, salario, id, nome, idade, cpf);
//                MinhaLista.add(objeto);
//            }
//
//            stmt.close();
//        } catch (SQLException ex) {
//        }
//        return MinhaLista;
//    }
//
//    // Cadastra novo Funcionario
//    public boolean InsertAlunoBD(Funcionario objeto) {
//        String sql = "INSERT INTO tb_funcionarios(id,nome,idade,profissao,salario,cpf) VALUES(?,?,?,?,?)";
//        try {
//            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
//            stmt.setInt(1, objeto.getId());
//            stmt.setString(2, objeto.getNome());
//            stmt.setInt(3, objeto.getIdade());
//            stmt.setString(4, objeto.getProfissao());
//            stmt.setDouble(5, objeto.getSalario());
//            stmt.setString(6, objeto.getCpf());
//            stmt.execute();
//            stmt.close();
//            return true;
//        } catch (SQLException erro) {
//            throw new RuntimeException(erro);
//        }
//    }
}

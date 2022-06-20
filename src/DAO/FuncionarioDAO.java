package DAO;

import Model.Funcionario;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class FuncionarioDAO {

    public static ArrayList<Funcionario> MinhaLista = new ArrayList<Funcionario>();

//--------------------------Conexão------------------------------
    public Connection getConexao() {
        Connection connection = null; //instância da conexão
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String server = "localhost";
            String database = "java-crud";
            String url = "jdbc:mysql://" + server + ":3306/" + database
                    + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "ajmp141028";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NÃO CONECTADO!");
            }
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    public ArrayList getMinhaLista() {
        MinhaLista.clear(); // Limpa nosso ArrayList
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_funcionarios");
            while (res.next()) {
                String profissao = res.getString("profissao");
                double salario = res.getDouble("salario");
                int id = res.getInt("id");
                String nome = res.getString("nome");
                int idade = res.getInt("idade");
                String cpf = res.getString("cpf");
                String img = res.getString("imgpath");
                Funcionario objeto = new Funcionario(profissao, salario, id, nome, idade, cpf, img);
                MinhaLista.add(objeto);
            }
            stmt.close();
        } catch (SQLException ex) {
        }
        return MinhaLista;
    }
    
    //--------------------------Update----------------------------------------
    public boolean UpdateFuncionarioBD(Funcionario objeto){
        String sql = "UPDATE tb_funcionarios set nome = ?, idade = ?, profissao = ?, salario = ?, cpf = ? WHERE id = ?";
        try{
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setString(1,objeto.getNome());
            stmt.setInt(2,objeto.getIdade());
            stmt.setString(3,objeto.getProfissao());
            stmt.setDouble(4,objeto.getSalario());
            stmt.setString(5,objeto.getCpf());
//            stmt.setString(6,objeto.getImg());
            stmt.setInt(6,objeto.getId());
            stmt.execute();
            stmt.close();
            return true;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
//---------------------CarregaFuncionario----------------------------------------
    public Funcionario carregaFuncionario(int id) {
        Funcionario objeto = new Funcionario();
        objeto.setId(id);
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * id FROM tb_funcionarios WHERE id =" + id);
            res.next();
            objeto.setNome(res.getString("nome"));
            objeto.setIdade(res.getInt("idade"));
            objeto.setProfissao(res.getString("profissao"));
            objeto.setSalario(res.getDouble("salario"));
            objeto.setCpf(res.getString("cpf"));
            objeto.setImg(res.getString("imgpath"));
            stmt.close();

        } catch (SQLException erro) {
        }
        return objeto;
    }
    
    //-------------------------Cadastrar----------------------------------
    public boolean InsertFuncionarioBD(Funcionario objeto) {
        String sql = "INSERT INTO tb_funcionarios(id,nome,idade,profissao,salario,cpf,imgpath) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setInt(3, objeto.getIdade());
            stmt.setString(4, objeto.getProfissao());
            stmt.setDouble(5, objeto.getSalario());
            stmt.setString(6, objeto.getCpf());
            stmt.setString(7, objeto.getImg());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
    
//-------------------------Delete----------------------------------
    public boolean DeleteFuncionarioBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_funcionarios WHERE id = " + id);
            stmt.close();
        } catch (SQLException erro) {
        }
        return true;
    }
    
    public int maiorID() throws SQLException{
        int maiorID = 0;
        try{
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id) id FROM tb_funcionarios");
            res.next();
            maiorID = res.getInt("id");
            stmt.close();
        }catch (SQLException ex){
        }
        return maiorID;
    }
}

package Model;

import java.util.*;
import DAO.FuncionarioDAO;
import java.sql.SQLException;

public class Funcionario extends Pessoa {

    // Atributos
    private String profissao;
    private double salario;
    
    FuncionarioDAO objFuncionario = new FuncionarioDAO();
    
    // Metodo Construtor de Objeto Vazio
    public Funcionario() {
    }

    // Metodo Construtor de Objeto, inserindo dados
    public Funcionario(String profissao, double salario) {
        this.profissao = profissao;
        this.salario = salario;
    }

    // Metodo Construtor usando tambem o construtor da SUPERCLASSE
    public Funcionario(String profissao,double salario, int id, String nome, int idade, String cpf) {
        super(id, nome, idade, cpf);
        this.profissao = profissao;
        this.salario = salario;
    }

    // Modos GET e SET
    public String getProfissao() {
        return profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Override necessário para poder retornar os dados de Pessoa no toString para funcionarios.
    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: " + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n CPF: " + this.getCpf()
                + "\n Profissao: " + this.getProfissao()
                + "\n Salario: " + this.getSalario()
                + "\n -----------";
    }

    /*
    
        ABAIXO OS MeTODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */
    // Retorna a Lista de funcionarios(objetos)
    public ArrayList getMinhaLista() {
        //return FuncionarioDAO.MinhaLista;
        return objFuncionario.getMinhaLista();
    }

    // Cadastra novo funcionario
    public boolean InsertFuncionarioBD(String profissao,double salario, String nome, int idade, String cpf) throws SQLException {
        int id = this.maiorID() + 1;
        Funcionario objeto = new Funcionario(profissao,salario, id, nome, idade, cpf);
        FuncionarioDAO.MinhaLista.add(objeto);
        objFuncionario.InsertFuncionarioBD(objeto);
        return true;

    }

    // Deleta um funcionario especefico pelo seu campo ID
    public boolean DeleteFuncionarioBD(int id) {
        int indice = this.procuraIndice(id);
        objFuncionario.DeleteFuncionarioBD(id);
        FuncionarioDAO.MinhaLista.remove(indice);
        return true;
    }

    // Edita um funcionario especefico pelo seu campo ID
    public boolean UpdateFuncionarioBD(String profissao,double salario,int id, String nome, int idade, String cpf) {
        Funcionario objeto = new Funcionario(profissao,salario, id, nome, idade, cpf);
        int indice = this.procuraIndice(id);
        objFuncionario.UpdateFuncionarioBD(objeto);
        FuncionarioDAO.MinhaLista.set(indice, objeto);
        return true;
    }

    // procura o INDICE de objeto da MinhaLista que contem o ID enviado.
    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < FuncionarioDAO.MinhaLista.size(); i++) {
            if (FuncionarioDAO.MinhaLista.get(i).getId() == id) {
                indice = i;
            }
        }
        return indice;
    }

    // carrega dados de um funcionario especfico pelo seu ID
    public Funcionario carregaFuncionario(int id) {
        int indice = this.procuraIndice(id);
        objFuncionario.carregaFuncionario(id);
        return FuncionarioDAO.MinhaLista.get(indice);
    }

    // retorna o maior ID da nossa base de dados
    public int maiorID() throws SQLException {
       //return FuncionarioDAO.maiorID();
       return objFuncionario.maiorID();
    }
}

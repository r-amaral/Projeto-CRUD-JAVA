package Model;

import java.util.*;
import DAO.FuncionarioDAO;

public class Funcionario extends Pessoa {

    // Atributos
    private String profissao;
    private double salario;
    
    // Metodo Construtor de Objeto Vazio
    public Funcionario() {
    }

    // Metodo Construtor de Objeto, inserindo dados
    public Funcionario(String profissao) {
        this.profissao = profissao;
    }

    // Metodo Construtor usando tambem o construtor da SUPERCLASSE
    public Funcionario(String profissao, int id, String nome, int idade) {
        super(id, nome, idade);
        this.profissao = profissao;
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
                + "\n profissao: " + this.getProfissao()
                + "\n -----------";
    }

    /*
    
        ABAIXO OS MeTODOS PARA USO JUNTO COM O DAO
        SIMULANDO A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS.
    
     */
    // Retorna a Lista de funcionarios(objetos)
    public ArrayList getMinhaLista() {
        return FuncionarioDAO.MinhaLista;
    }

    // Cadastra novo funcionario
    public boolean InsertFuncionarioBD(String profissao, int fase, String nome, int idade) {
        int id = this.maiorID() + 1;
        Funcionario objeto = new Funcionario(profissao, id, nome, idade);
        FuncionarioDAO.MinhaLista.add(objeto);
        return true;

    }

    // Deleta um funcionario especefico pelo seu campo ID
    public boolean DeleteFuncionarioBD(int id) {
        int indice = this.procuraIndice(id);
        FuncionarioDAO.MinhaLista.remove(indice);
        return true;
    }

    // Edita um funcionario especefico pelo seu campo ID
    public boolean UpdateFuncionarioBD(String profissao, int fase, int id, String nome, int idade) {
        Funcionario objeto = new Funcionario(profissao, id, nome, idade);
        int indice = this.procuraIndice(id);
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
        return FuncionarioDAO.MinhaLista.get(indice);
    }

    // retorna o maior ID da nossa base de dados
    public int maiorID() {
        return FuncionarioDAO.maiorID();
    }
}

package Model;

public abstract class Pessoa {

    // Atributos
    private int id;
    private String nome;
    private int idade;
    private String cpf;

    // Metodo Construtor de Objeto Vazio
    public Pessoa() {
    }

    // Metodo Construtor de Objeto, inserindo dados
    public Pessoa(int id, String nome, int idade, String cpf) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Metodos GET e SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

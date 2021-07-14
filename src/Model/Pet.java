package Model;

public class Pet {

    private int codigo;
    private String nome;
    private String animal;
    private String raca;
    private int idade;
    private double preco;

    public Pet(int codigo, String nome, String animal, String raca, int idade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.animal = animal;
        this.raca = raca;
        this.idade = idade;
        this.preco = preco;

    }

    public Pet(String nome, String animal, String raca, int idade, double preco) {
        this.nome = nome;
        this.animal = animal;
        this.raca = raca;
        this.idade = idade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarListaUsuario(Usuario p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

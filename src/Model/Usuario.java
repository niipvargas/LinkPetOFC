
package Model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;


public class Usuario {
    

    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Pet> pets;
    
    public Usuario(int codigo, String nome, String endereco, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.pets = new ArrayList<Pet>();
    }

    public Usuario(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone; 
        this.pets = new ArrayList<Pet>();
    }
   

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void AdicionarListaPet(Pet p2) {
       pets.add(p2);
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

   
}
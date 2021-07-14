package DAO;

import Model.Pet;
import Model.Usuario;
import Utils.ConexaoDoBanquinho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PetDAO {

    static public int InserirPetDB(Pet pet) {
        String sql = "INSERT INTO cadastro_pet (nome, animal, raca, idade, preco) VALUES (?,?,?,?,?)";
        Connection conexao = ConexaoDoBanquinho.CriarConexao();
        try {
            PreparedStatement stm;
            stm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, pet.getNome());
            stm.setString(2, pet.getAnimal());
            stm.setString(3, pet.getRaca());
            stm.setInt(4, pet.getIdade());
            stm.setDouble(5, pet.getPreco());
            stm.execute();
            ResultSet rs = stm.getGeneratedKeys();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("NÃO FOI POSSIVEL FAZER A INSERÇÃO DO PET" + e);
        }
        return 0;
    }

    static public ArrayList<Pet> BuscarTodosPet() {
        String sql = "SELECT * FROM cadastro_pet ORDER BY codigo";
        Connection conexao = ConexaoDoBanquinho.CriarConexao();
        ArrayList ListaPet = new ArrayList();

        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                String animal = resultado.getString("animal");
                String raca = resultado.getString("raca");
                int idade = resultado.getInt("idade");
                double preco = resultado.getDouble("preco");
                Pet p2 = new Pet(codigo, nome, animal, raca, idade, preco);
                ListaPet.add(p2);
            }
            return ListaPet;
        } catch (SQLException e) {
            System.out.println("NÃO FOI POSSIVEL BUSCAR DADOS" + e);
        }
        return ListaPet;
    }

    public static void DeletarPetPorCodigo(int codigo) {
        String sql = "DELETE FROM  pet WHERE codigo = ?";
        Connection conexao = ConexaoDoBanquinho.CriarConexao();
        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            stm.setInt(1, codigo);
            stm.executeUpdate();
        } catch (SQLException erro) {
            System.out.println("DEU ERRO AO DELETAR" + erro);
        }
    }

    public static void AtualizarPet(Pet pet) {
        String sql = "UPDATE usuario SET nome = ?, animal = ?, raca = ?, idade = ?, preco = ? = ? WHERE codigo = ?";
        Connection conexao = ConexaoDoBanquinho.CriarConexao();
        try {
            PreparedStatement bla = conexao.prepareStatement(sql);
            bla.setString(1, pet.getNome());
            bla.setString(2, pet.getAnimal());
            bla.setString(3, pet.getRaca());
            bla.setInt(4, pet.getIdade());
            bla.setDouble(5, pet.getPreco());
            bla.setInt(6, pet.getCodigo());
//            bla.setString(7, pet.getNomeDono());
            bla.executeUpdate();
        } catch (SQLException erro) {
            System.out.println("ERRO AO ATUALIZAR" + erro);
        }
    }

    static public void RelacionarPetPessoa(Pet pet, Usuario usuario) {
        String sql = "INSERT INTO pessoa_pet (codigo_pet, codigo_pessoa) VALUES (?,?)";
        Connection conexao = ConexaoDoBanquinho.CriarConexao(); 
        try {
            PreparedStatement stm;
            stm = conexao.prepareStatement(sql);
            stm.setInt(1, pet.getCodigo());
            stm.setInt(2, usuario.getCodigo());
            stm.execute();
        } catch (SQLException e) {
            System.out.println("NÃO FOI POSSIVEL FAZER A INSERÇÃO DO PET" + e);
        }

    }
}

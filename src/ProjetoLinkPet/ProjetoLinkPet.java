
package ProjetoLinkPet;

import Model.Pet;
    import Model.Usuario;
import Utils.ConexaoDoBanquinho;
import View.TelaCadastro;
import View.TelaCadastroPet;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;

public class ProjetoLinkPet {
    


    public static ArrayList<Usuario> listaUsuario = null;
    public static ArrayList<Pet> ListaPet = null;

    public static void main(String[] args) throws NoSuchAlgorithmException, ParseException {
        new TelaCadastroPet().setVisible(true);  
       

}
}

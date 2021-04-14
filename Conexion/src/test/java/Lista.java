import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author Fam. Aguila Hdez
 */
public class Lista {
    public static void main(String[] args) throws SQLException{
        List<Usuario> listUsuarios=new ArrayList<>();
        listUsuarios=DaoUsuario.listaUsuarios();
        for(Usuario usuario:listUsuarios){
            System.out.println(usuario);
         }
    }
}
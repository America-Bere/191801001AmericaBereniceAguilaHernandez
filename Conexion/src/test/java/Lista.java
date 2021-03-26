
import java.sql.*;
//import Conexion.Conexion;
import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) throws SQLException{
        List<Usuario> listUsuarios=new ArrayList<>();
        listUsuarios=DaoUsuario.listaUsuarios();
        for(Usuario usuario:listUsuarios){
            System.out.println(usuario);
        }
    }
}



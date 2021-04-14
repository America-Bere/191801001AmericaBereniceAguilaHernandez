import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * @author Fam. Aguila Hdez
 */
public class Insertar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Escribe el nombre del usuario: ");
        String nom=scanner.nextLine();
        System.out.println("Escribe la contraseña del usuario: ");
        String con=scanner.nextLine();
        Usuario usuario=new Usuario(nom,con);
        DaoUsuario.insertar(usuario);
        
    }
}
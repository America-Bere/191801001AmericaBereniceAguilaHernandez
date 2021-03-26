
import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * @author Fam. Aguila Hdez
 */
public class Eliminar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID: ");
         int id=scanner.nextInt();
         Usuario usuario=new Usuario(id);
         DaoUsuario.eliminar(usuario);
    }
}

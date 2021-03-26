
import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 * @author Fam. Aguila Hdez
 */
public class Insertar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Escribe el nombre del usuario: ");
        String nom=scanner.nextLine();
        System.out.println("Escribe el nombre la contraseña del usuario: ");
        String con=scanner.nextLine();
         System.out.println("Estado del usuario\n1=activo    0=no activo");
        int sta=scanner.nextInt();
        Usuario usuario=new Usuario();
        DaoUsuario.insertar(usuario);
        
    }
}

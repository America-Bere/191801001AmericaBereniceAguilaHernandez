import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * @author Fam. Aguila Hdez
 */
public class Actualizar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID del usuario: ");
        int id=scanner.nextInt();
        System.out.println("Escribe el nuevo nombre del usuario:");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("Escribe la nueva contraseña: ");
        scanner.nextLine();
        String contra = scanner.nextLine();
        Usuario usuario=new Usuario(nombre,contra,id);
        DaoUsuario.actualizar(usuario);
    }
}


import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Actualizar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID del usuario: ");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escribe el nuevo nombre del usuario:");
        String nombre = scanner.nextLine();
        System.out.println("Escribe la nueva contraseña: ");
        String contra = scanner.nextLine();
        System.out.println("Escribe el nuevo estatus del usuario\n1=activo    0=no activo");
        int status= scanner.nextInt();
        Usuario usuario=new Usuario(nombre,contra,1);
        DaoUsuario.actualizar(usuario);
    }
}

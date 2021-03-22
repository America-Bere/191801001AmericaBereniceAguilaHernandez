
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
        System.out.println("Escribe el nuevo nombre del usuario:");
        String nombre = scanner.nextLine();
        System.out.println("Escribe la nueva contraseña: ");
        String contra = scanner.nextLine();
        System.out.println("Escribe el nuevo estatus del usuario\n1=activo    0=no activo");
        int status= scanner.nextInt();
        Usuario usuario=new Usuario();
        DaoUsuario.actualizar(usuario);
    }
}
        /*String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexion con base de datos
            Connection conexion=DriverManager.getConnection(url,"root","");
            //Crear una declaracion de como se va a trabajar en la clase de datos
             String SQL="UPDATE  usuarios SET nombre = ?, contraseña = ?, status = ? WHERE id=?";
             //String SQL = "UPDATE usuarios SET id=? WHERE id=?";
             PreparedStatement declaracion=conexion.prepareStatement(SQL);
             //Insertar datos
            System.out.println("Escribe el ID del usuario: ");
            int id=scanner.nextInt();
            /*System.out.println("Escribe el nuevo ID: ");
            int id2=scanner.nextInt();*/
            /*scanner.nextLine();
            System.out.println("Escribe el nuevo nombre del usuario:");
            String nombre = scanner.nextLine();
            System.out.println("Escribe la nueva contraseña: ");
            String contra = scanner.nextLine();
            System.out.println("Escribe el nuevo estatus del usuario\n1=activo    0=no activo");
            int status= scanner.nextInt();
            declaracion.setString(1, nombre);
            declaracion.setString(2, contra);
            declaracion.setInt(3, status);
            declaracion.setInt(4, id);
            //Cerrar toda conexion con la base de datos
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
            }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    } 
}*/
    

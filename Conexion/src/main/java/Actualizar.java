
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
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexion con base de datos
            Connection conexion=DriverManager.getConnection(url,"root","");
            //Crear una declaracion de como se va a trabajar en la clase de datos
             //String SQL="UPDATE  usuarios SET id=?,nombre=?,contraseña=?,status=? WHERE id=?";
             String SQL = "UPDATE usuarios SET id=? WHERE id=?";
             PreparedStatement declaracion=conexion.prepareStatement(SQL);
             //Insertar datos
            System.out.println("Escribe el ID del usuario: ");
            int id=scanner.nextInt();
            System.out.println("Escribe el nuevo ID: ");
            int id2=scanner.nextInt();
            /*System.out.println("Escribe el nuevo nombre del usuario:");
            String nombre = scanner.nextLine();
            System.out.println("Escribe la nueva contraseña: ");
            String contra = scanner.nextLine();
            System.out.println("Escribe el nuevo estatus del usuario");
            int status= scanner.nextInt();*/
            declaracion.setInt(1, id2);
            declaracion.setInt(2, id);
            /*declaracion.setString(3, nombre);
            declaracion.setString(4, contra);
            declaracion.setInt(5, status);*/
            //Cerrar toda conexion con la base de datos
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
            }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    } 
}

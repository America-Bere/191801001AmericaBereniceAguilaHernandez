
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
public class Eliminar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID: ");
         int id=scanner.nextInt();
         Usuario usuario=new Usuario(id);
         DaoUsuario.eliminar(usuario);
    }
}
        /*String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            Connection conexion=DriverManager.getConnection(url,"root","");
            String SQL="DELETE FROM usuarios WHERE id=? ";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            System.out.println("Escribe el ID del usuario: ");
            int id=scanner.nextInt();
            declaracion.setInt(1, id);
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
            }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }   
}*/

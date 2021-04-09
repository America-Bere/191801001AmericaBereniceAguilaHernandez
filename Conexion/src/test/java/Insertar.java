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
        Usuario usuario=new Usuario(nom,con);
        DaoUsuario.insertar(usuario);
        
    }
}
        /*String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //crear conexion con base de datos
            Connection conexion=DriverManager.getConnection(url,"root","");
            //crear una declaracion de como se va a trabajar en la base de datos
            String SQL="INSERT INTO usuarios (nombre,contraseña,status) VALUES (?,?,?) ";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            System.out.println("Escribe el nombre del usuario: ");
            String nom=scanner.nextLine();
            declaracion.setString(1, nom);
            System.out.println("Escribe el nombre la contraseña del usuario: ");
            String con=scanner.nextLine();
            declaracion.setString(2, con);
            System.out.println("Estado del usuario\n1=activo    0=no activo");
            int sta=scanner.nextInt();
            declaracion.setInt(3, sta);
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            declaracion.executeUpdate();
           
            //imprimir valores
            //resultado.close();
            declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}*/

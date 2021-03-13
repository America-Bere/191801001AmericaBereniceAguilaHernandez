
import java.sql.*;

public class Conexion {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //crear conexion con base de datos
            Connection Conexion=DriverManager.getConnection(url,"root","");
            //crear una declaracion de como se va a trabajar en la base de datos
            Statement declaracion=Conexion.createStatement();
            String SQL="SELECT * FROM usuarios";
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            ResultSet resultado=declaracion.executeQuery(SQL);
           
            //imprimir valores
            while(resultado.next())
            {   //System.out.println(resultado.getString("id"));
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("contraseña"));
                System.out.println(resultado.getInt("status"));
                System.out.println(resultado.getDate("fecha_de_alta"));
                System.out.println("\n\n");
                //System.out.println(resultado.getInt("id_usuario"));
            }
            resultado.close();
            declaracion.close();
            Conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}

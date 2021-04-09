package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Conexion {
    //static: es una palabra reservada que determina que el atributo es de la clase y no del objeto
    //Final: es un modificador que indicia que el atributo es una constante por lo que no se podra cambiar el valor de ningun modo
        private static final String URL="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        private static final String USUARIO = "root", PASSWORD = "";
        public static Connection getConnection;
        public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
            //throws SQLException es el try y catch implementado en un metodo
        }
        //throws=de cualquier error que haya, lo va a traer y mostrar
        public static void close(Connection conexion) throws SQLException{
            conexion.close();
        }
        public static void close(Connection conexion,ResultSet resultado) throws SQLException{
            conexion.close();
            resultado.close();
        }
                    //polimorfismo
        public static void close(Connection conexion, ResultSet resultado, Statement declaracion) throws SQLException{
            conexion.close();
            resultado.close();
            declaracion.close();
        }
        public static void close(Connection conexion,Statement declaracion) throws SQLException{
            conexion.close();
            declaracion.close();
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public static void Update(String nom, String con, int sta){
        String SQL="INSERT INTO usuarios (nombre,contraseña,status) VALUES (?,?,?) ";
         PreparedStatement declaracion=conexion.prepareStatement(SQL);
         declaracion.setString(1, nom);
            declaracion.setString(2, con);
            declaracion.setInt(3, sta);
    }*/
}

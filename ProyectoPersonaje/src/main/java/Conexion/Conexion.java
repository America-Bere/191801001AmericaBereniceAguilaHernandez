package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Fam. Aguila Hdez
 */
public class Conexion {
    private static final String URL="jdbc:mysql://localhost:3306/personajes?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root", PASSWORD = "";
    public static Connection getConnection;
    public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
    public static void close(Connection conexion) throws SQLException{
            conexion.close();
        }
        public static void close(Connection conexion,ResultSet resultado) throws SQLException{
            conexion.close();
            resultado.close();
        }
        public static void close(Connection conexion, ResultSet resultado, Statement declaracion) throws SQLException{
            conexion.close();
            resultado.close();
            declaracion.close();
        }
        public static void close(Connection conexion,Statement declaracion) throws SQLException{
            conexion.close();
            declaracion.close();
        }
}

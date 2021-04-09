package DaoPersonaje;
import Conexion.Conexion;
import Proyecto.Personaje;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Fam. Aguila Hdez
 */
public class DaoPersonaje {
    
     private static String SQL;
     
     public static List<Personaje> asistenciaPersonajes () throws SQLException{
            List<Personaje> listPersonajes=new ArrayList<>();
            Connection conexion = Conexion.getConnection();
            Statement declaracion=conexion.createStatement();
            SQL="SELECT * FROM usuarios";
            ResultSet resultado=declaracion.executeQuery(SQL);
            while(resultado.next()){   
                Personaje personaje=new Personaje( resultado.getString("nombre"), resultado.getInt("id"),resultado.getString("sexo"),resultado.getString("clan"));
                listPersonajes.add(personaje);
            }
            Conexion.close(conexion, declaracion);
            return listPersonajes;
     }
}

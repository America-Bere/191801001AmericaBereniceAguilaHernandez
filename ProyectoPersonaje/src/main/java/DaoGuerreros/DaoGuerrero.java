package DaoGuerreros;
import Conexion.Conexion;
import Proyecto.Guerrero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Fam. Aguila Hdez
 */
public class DaoGuerrero {
    
     private static String SQL;
     
     public static List<Guerrero> asistenciaGuerrero () throws SQLException{
            List<Guerrero> listGuerreros=new ArrayList<>();
            Connection conexion = Conexion.getConnection();
            Statement declaracion=conexion.createStatement();
            SQL="SELECT * FROM guerrero";
            ResultSet resultado=declaracion.executeQuery(SQL);
            while(resultado.next()){  
                Guerrero personaje=new Guerrero(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("sexo"), resultado.getString("clan"),resultado.getInt("ataque"),resultado.getInt("salud"),resultado.getString("habilidad"),resultado.getString("categoria"));
                listGuerreros.add(personaje);
            }
            Conexion.close(conexion, declaracion);
            return listGuerreros;
     }
     public static void insertar(Guerrero guerrero) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="INSERT INTO guerrero (nombre,sexo,clan,ataque,salud,habilidad,categoria) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setString(1, guerrero.getNombre());
            declaracion.setString(2, guerrero.getSexo());
            declaracion.setString(3, guerrero.getClan());
            declaracion.setInt(4, guerrero.getAtaque());
            declaracion.setInt(5,guerrero.getSalud());
            declaracion.setString(6, guerrero.getHabilidad());
            declaracion.setString(7, guerrero.getCategoria());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
     public static void eliminar(Guerrero guerrero) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="DELETE FROM guerrero WHERE id=? ";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setInt(1, guerrero.getId());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
     public static void actualizar(Guerrero guerrero) throws SQLException{
           Connection conexion = Conexion.getConnection();
           SQL = "UPDATE guerrero SET clan = ?,ataque=?,salud=? WHERE id = ?";
           PreparedStatement declaracion = conexion.prepareStatement(SQL);
           declaracion.setString(1, guerrero.getClan());
           declaracion.setInt(2, guerrero.getAtaque());
           declaracion.setInt(3, guerrero.getSalud());
           declaracion.setInt(4, guerrero.getId());
           declaracion.executeUpdate();
           Conexion.close(conexion, declaracion);
        }
}

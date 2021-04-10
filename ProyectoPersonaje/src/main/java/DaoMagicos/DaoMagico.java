package DaoMagicos;
import Conexion.Conexion;
import Proyecto.Magico;
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
public class DaoMagico {
    private static String SQL;
    public static List<Magico> asistenciaMagico () throws SQLException{
        List<Magico> listMagicos=new ArrayList<>();
            Connection conexion = Conexion.getConnection();
            Statement declaracion=conexion.createStatement();
            SQL="SELECT * FROM magico";
            ResultSet resultado=declaracion.executeQuery(SQL);
            while(resultado.next()){  
                Magico personajeDos=new Magico(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("sexo"), resultado.getString("clan"),resultado.getInt("ataque"),resultado.getInt("salud"),resultado.getString("habilidad"),resultado.getString("categoria"),resultado.getString("hechizo"));
                listMagicos.add(personajeDos);
            }
            Conexion.close(conexion, declaracion);
            return listMagicos;
    }
    public static void insertar(Magico magico) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="INSERT INTO magico (nombre,sexo,clan,ataque,salud,habilidad,categoria,hechizo) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setString(1, magico.getNombre());
            declaracion.setString(2, magico.getSexo());
            declaracion.setString(3, magico.getClan());
            declaracion.setInt(4, magico.getAtaque());
            declaracion.setInt(5,magico.getSalud());
            declaracion.setString(6, magico.getHabilidad());
            declaracion.setString(7, magico.getCategoria());
            declaracion.setString(8, magico.getHechizo());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
    
}

package DaoMitologicos;
import Conexion.Conexion;
import Proyecto.Mitologico;
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
public class DaoMitologico {
    private static String SQL;
    public static List<Mitologico> asistenciaMitologico () throws SQLException{
        List<Mitologico> listMitologicos=new ArrayList<>();
            Connection conexion = Conexion.getConnection();
            Statement declaracion=conexion.createStatement();
            SQL="SELECT * FROM mitologico";
            ResultSet resultado=declaracion.executeQuery(SQL);
            while(resultado.next()){  
                Mitologico personajeTres=new Mitologico(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("sexo"), resultado.getString("clan"),resultado.getInt("ataque"),resultado.getInt("salud"),resultado.getString("habilidad"),resultado.getString("categoria"),resultado.getString("hechizo"), resultado.getString("transformacion"));
                listMitologicos.add(personajeTres);
            }
            Conexion.close(conexion, declaracion);
            return listMitologicos;
       }
    public static void insertar(Mitologico mitologico) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="INSERT INTO mitologico (nombre,sexo,clan,ataque,salud,habilidad,categoria,hechizo,transformacion) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setString(1, mitologico.getNombre());
            declaracion.setString(2, mitologico.getSexo());
            declaracion.setString(3, mitologico.getClan());
            declaracion.setInt(4, mitologico.getAtaque());
            declaracion.setInt(5,mitologico.getSalud());
            declaracion.setString(6, mitologico.getHabilidad());
            declaracion.setString(7, mitologico.getCategoria());
            declaracion.setString(8, mitologico.getHechizo());
            declaracion.setString(9, mitologico.getTranformacion());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
}

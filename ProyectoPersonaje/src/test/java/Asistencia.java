import DaoPersonaje.DaoPersonaje;
import Proyecto.Personaje;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/*
 * @author Fam. Aguila Hdez
 */
public class Asistencia {
    public static void main(String[] args) throws SQLException{
        List<Personaje> listPersonajes=new ArrayList<>();
        listPersonajes=DaoPersonaje.asistenciaPersonajes();
        for(Personaje personaje:listPersonajes){
            System.out.println(personaje);
         }
    }
}

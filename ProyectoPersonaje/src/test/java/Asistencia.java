import DaoGuerreros.DaoGuerrero;
import Proyecto.Guerrero;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/*
 * @author Fam. Aguila Hdez
 */
public class Asistencia {
    public static void main(String[] args) throws SQLException{
        List<Guerrero> listGuerreros=new ArrayList<>();
        listGuerreros=DaoGuerrero.asistenciaGuerrero();
        for(Guerrero personaje:listGuerreros){
            System.out.println(personaje);
         }
    }
}

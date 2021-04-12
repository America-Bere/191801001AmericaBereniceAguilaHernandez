import DaoMitologicos.DaoMitologico;
import Proyecto.Mitologico;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author Fam. Aguila Hdez
 */
public class AsistenciaMitologico {
    public static void main(String[] args) throws SQLException{
        List<Mitologico> listMitologicos=new ArrayList<>();
        listMitologicos=DaoMitologico.asistenciaMitologico();
        for(Mitologico personajeTres:listMitologicos){
            System.out.println(personajeTres);
         }
    }
}

import DaoClanes.DaoClan;
import Proyecto.Clan;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * @author Fam. Aguila Hdez
 */
public class MostrarClanes {
    public static void main(String[] args) throws SQLException {
        List<Clan> listClanes=new ArrayList<>();
        listClanes=DaoClan.asistenciaClan();
        for(Clan personajeCuatro:listClanes){
            System.out.println(personajeCuatro);
         }
    }    
}

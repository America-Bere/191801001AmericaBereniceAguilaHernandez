import DaoMagicos.DaoMagico;
import Proyecto.Guerrero;
import Proyecto.Magico;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Fam. Aguila Hdez
 */
public class AsistenciaMagico {
    public static void main(String[] args) throws SQLException{
        List<Magico> listMagicos=new ArrayList<>();
        listMagicos=DaoMagico.asistenciaMagico();
        for(Magico personajeDos:listMagicos){
            System.out.println(personajeDos);
         }
    }
}

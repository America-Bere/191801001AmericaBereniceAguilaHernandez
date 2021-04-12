import DaoClanes.DaoClan;
import Proyecto.Clan;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * @author Fam. Aguila Hdez
 */
public class EliminarClan {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID del clan: ");
        int id=scanner.nextInt();
        Clan clan=new Clan(id);
         DaoClan.eliminar(clan);
    }
}

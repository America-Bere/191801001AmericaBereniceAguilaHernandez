import DaoGuerreros.DaoGuerrero;
import Proyecto.Guerrero;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * @author Fam. Aguila Hdez
 */
public class ActualizarGuerrero {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID del usuario: ");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escribe el nuevo clan del guerrero:");
        String clan = scanner.nextLine();
        System.out.println("Cantidad de ataque: ");
        int ataque=scanner.nextInt();
        System.out.println("Cantidad de salud: ");
        int salud=scanner.nextInt();
        //Guerrero guerrero=new Guerrero (id,clan);
        Guerrero guerrero=new Guerrero (id,clan,ataque,salud);
        DaoGuerrero.actualizar(guerrero);
    }
}
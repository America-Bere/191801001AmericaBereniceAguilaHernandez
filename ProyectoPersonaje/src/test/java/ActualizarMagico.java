import DaoMagicos.DaoMagico;
import Proyecto.Magico;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * @author Fam. Aguila Hdez
 */
public class ActualizarMagico {
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
        //Magico magico=new Magico (id,clan);
        Magico magico=new Magico (id,clan,ataque,salud);
        DaoMagico.actualizar(magico);
    }
}

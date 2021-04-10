import DaoGuerreros.DaoGuerrero;
import Proyecto.Guerrero;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * @author Fam. Aguila Hdez
 */
public class InsertarGuerrero {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el nombre del guerrero: ");
        String nombre=scanner.nextLine();
        System.out.println("Sexo del guerrero [solo F o M]: ");
        String sexo=scanner.nextLine();
        System.out.println("Clan del guerrero: ");
        String clan=scanner.nextLine();
        System.out.println("Cantidad de ataque: ");
        int ataque=scanner.nextInt();
        System.out.println("Cantidad de salud: ");
        int salud=scanner.nextInt();
        System.out.println("Tipo de habilidad: ");
        String habilidad=scanner.nextLine();
        System.out.println("Categoria a la que pertenece: ");
        String categoria=scanner.nextLine();
        Guerrero guerrero=new Guerrero(nombre,sexo,clan,ataque,salud,habilidad,categoria);
        DaoGuerrero.insertar(guerrero);
    }
}

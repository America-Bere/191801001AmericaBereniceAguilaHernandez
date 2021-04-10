import DaoMagicos.DaoMagico;
import Proyecto.Magico;
import java.sql.SQLException;
import java.util.Scanner;
/*
 * @author Fam. Aguila Hdez
 */
public class InsertarMagico {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el nombre del guerrero magico: ");
        String nombre=scanner.nextLine();
        System.out.println("Sexo del guerrero magico [solo F o M]: ");
        String sexo=scanner.nextLine();
        System.out.println("Clan del guerrero magico: ");
        String clan=scanner.nextLine();
        System.out.println("Cantidad de ataque: ");
        int ataque=scanner.nextInt();
        System.out.println("Cantidad de salud: ");
        int salud=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Tipo de habilidad: ");
        String habilidad=scanner.nextLine();
        System.out.println("Categoria a la que pertenece: ");
        String categoria=scanner.nextLine();
        System.out.println("Hechizo que tiene: ");
        String hechizo=scanner.nextLine();
        Magico magico=new Magico(nombre,sexo,clan,ataque,salud,habilidad,categoria,hechizo);
        DaoMagico.insertar(magico);
    }
}

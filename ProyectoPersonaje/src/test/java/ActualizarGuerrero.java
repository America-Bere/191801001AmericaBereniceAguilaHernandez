
import DaoGuerreros.DaoGuerrero;
import Proyecto.Guerrero;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
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
        Guerrero guerrero=new Guerrero (clan,id);
        DaoGuerrero.actualizar(guerrero);
    }
}

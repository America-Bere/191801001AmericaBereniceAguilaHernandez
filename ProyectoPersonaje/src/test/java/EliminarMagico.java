
import DaoMagicos.DaoMagico;
import Proyecto.Magico;
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
public class EliminarMagico {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID: ");
         int id=scanner.nextInt();
         Magico magico=new Magico(id);
         DaoMagico.eliminar(magico);
    }
}

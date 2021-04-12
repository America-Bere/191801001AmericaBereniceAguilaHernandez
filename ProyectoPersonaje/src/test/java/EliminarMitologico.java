
import DaoMitologicos.DaoMitologico;
import Proyecto.Mitologico;
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
public class EliminarMitologico {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID: ");
         int id=scanner.nextInt();
         Mitologico mitologico=new Mitologico(id);
         DaoMitologico.eliminar(mitologico);
    }
}


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
public class EliminarGuerrero {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el ID: ");
         int id=scanner.nextInt();
         Guerrero guerrero=new Guerrero(id);
         DaoGuerrero.eliminar(guerrero);
    }
    
}

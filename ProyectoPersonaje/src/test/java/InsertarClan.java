
import DaoClanes.DaoClan;
import Proyecto.Clan;
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
public class InsertarClan {
    public static void main(String[] args) throws SQLException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe el nombre del clan: ");
        String nombre=scanner.nextLine();
        System.out.println("Cantidad de participantes: ");
        int participantes=scanner.nextInt();
        Clan clan=new Clan(nombre,participantes);
        DaoClan.insertar(clan);
    }
}


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
public class TestPapasFritas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nombre de las papas: ");
        String nombre=scanner.nextLine();
        System.out.println("Nombre de la marca: ");
        String marca=scanner.nextLine();
        System.out.println("Sabor: ");
        String sabor=scanner.nextLine();
        System.out.println("Fecha de caducidad: ");
        String caducidad=scanner.nextLine();
        System.out.println("Hechas en: ");
        String produccion=scanner.nextLine();
        System.out.println("Cantidad de papas: ");
        double cantidad=scanner.nextDouble();
        System.out.println("Precio: ");
        double precio=scanner.nextDouble();
        System.out.println("Codigo: ");
        int codigo=scanner.nextInt();
        System.out.println("Total de calorias: ");
        int calorias=scanner.nextInt();
        
        PapasFritas papasQueso=new PapasFritas("queso", "Barcel", "15-05-2021", "Mexico", 150, 123, 15, 30, "Ruffles");
        PapasFritas papasAzar=new PapasFritas(sabor, marca, caducidad, produccion, calorias, codigo, precio, cantidad, nombre);
        System.out.println(papasQueso+"\n\n"+papasAzar+"\n");
    }
}
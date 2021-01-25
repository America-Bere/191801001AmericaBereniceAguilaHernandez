
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
public class Proyecto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        double promedioUno=scanner.nextDouble();
        System.out.println("Escribe otro numero: ");
        double promedioDos=scanner.nextDouble();
        System.out.println("Escribe el ultimo numero: ");
        double promedioTres=scanner.nextDouble();
         System.out.println((promedioUno + promedioDos + promedioTres)/3);
         
  
    }
    
}

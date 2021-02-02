/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Fam. Aguila Hdez
 */
public class MilimetrosConvertidosEnMetros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double metros,milimetros; 
        System.out.println("Escribe los milimetros: ");
        milimetros=scanner.nextDouble();
        metros=0.001* milimetros;
        //el numero 0.001 sale de la division 1/100, de la cual el resultado se multiplica por los milimetros
        System.out.println("Los milimetros son en metros: "+metros);
    }  
}

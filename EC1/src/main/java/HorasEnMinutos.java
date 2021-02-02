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
public class HorasEnMinutos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int horas,minutos;
        System.out.println("Escribe las horas");
        horas=scanner.nextInt();
        minutos=horas * 60;
        System.out.println("Tus minutos son: "+minutos);
    }
    
}

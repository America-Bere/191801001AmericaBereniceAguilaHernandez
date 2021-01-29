/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
import java.util.Scanner;
public class Opciones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero1;
        System.out.println("Da el primer valor");
        numero1=scanner.nextInt();
        switch(numero1)
        {
            case 1: System.out.println("Este es el caso numero 1");
                break;
            case 2: System.out.println("Este es el caso numero 2");
                break;
            default: System.out.println("Este caso no existe");
        }
    }
}


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
public class Tacos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tacos, refrescos,tacosTotal,refrescosTotal,pago;
        System.out.println("Numero de tacos que el cliente consumió: ");
        tacos=scanner.nextInt();
        System.out.println("Numero de refrescos que el cliente consumió: ");
        refrescos=scanner.nextInt();
        tacosTotal=tacos*17;
        refrescosTotal=refrescos*10;
        pago=tacosTotal + refrescosTotal;
        System.out.println("El cliente debe  "+pago);
    }
}

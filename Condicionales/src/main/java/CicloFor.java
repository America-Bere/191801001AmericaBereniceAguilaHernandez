
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
public class CicloFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Deme un numero de la serie");
        int serie=scanner.nextInt();
        for(int i=0; i <= serie;i++){
            System.out.print(i);
            System.out.print("\n");
        }
        System.out.print("\n\n");
       int i=serie;
        while(i >= 0){
            System.out.print(i);
            System.out.print("\n");
             i--;
        }
    } 
}

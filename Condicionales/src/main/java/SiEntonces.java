
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
public class SiEntonces {
    public static void main(String[] args) {
        int numero1;
      Scanner scanner=new Scanner(System.in);
      System.out.println("Escribe un numero");
      numero1=scanner.nextInt();
      if(numero1 < 0)
      {
          System.out.println("Hola mundo");
      }
      else
      {
          System.out.println("No pues hola xd");
      }
    }
}

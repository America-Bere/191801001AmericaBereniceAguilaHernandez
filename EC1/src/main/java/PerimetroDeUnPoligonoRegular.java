
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
public class PerimetroDeUnPoligonoRegular {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Numero de lados de la figura: ");
        int numeroLados=scanner.nextInt();
        System.out.println("Medida de un lado en centimetros: ");
        double medida=scanner.nextDouble();
        double perimetro=numeroLados * medida;
        System.out.println("El perimetro de la figura es "+perimetro);
        
    }
}

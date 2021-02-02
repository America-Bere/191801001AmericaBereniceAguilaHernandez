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
public class AreaDeUnTriangulo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tamaño de la base en centimetros: ");
        double base=scanner.nextDouble();
        System.out.println("Tamaño de la altura en centimetros: ");
        double altura=scanner.nextDouble();
        double areaTriangulo=(base * altura)/2;
        System.out.println("El area de tu triangulo es:  "+areaTriangulo);
    }
}

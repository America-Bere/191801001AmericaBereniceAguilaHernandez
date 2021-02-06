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
public class TestMateria {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nombre de la materia: ");
        String nombre=scanner.nextLine();
        System.out.println("Nombre de la carrera: ");
        String carrera=scanner.nextLine();
        System.out.println("Numero de cuatrimestre: ");
        int cuatrimestre=scanner.nextInt();
        System.out.println("Codigo de la materia: ");
        int codigo=scanner.nextInt();
        System.out.println("Creditos de la materia: ");
        int creditos=scanner.nextInt();
        Materia redes=new Materia("Escalamiento de redes", "TIC'S", 5, 123, 7);
        Materia poo=new Materia("Fundamento de Programacion Orientada a Objetos", "TIC's", 5, 321, 6); 
        Materia mate=new Materia("Matematicas", "TIC's", 5, 456, 8);
        Materia nueva=new Materia(nombre, carrera, cuatrimestre, codigo, creditos);
        System.out.println(nueva+"\n"+redes+"\n"+poo+"\n"+mate);
    }
    
}

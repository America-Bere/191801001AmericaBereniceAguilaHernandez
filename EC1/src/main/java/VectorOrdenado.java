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
public class VectorOrdenado {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int vector[]=new int[3], aux;
        for(int i=0;i < 3; i++ ){
            System.out.println("Escribe un numero: ");
            vector[i]=scanner.nextInt();
        }
        for(int i=0; i < 2;i++){
            for(int j=1; j < 3; j++){
                if(vector[i] > vector[j]){
                    aux=vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
        System.out.println("\nEstos son los numeros ordenados: \n");
        for(int i=0;i < 3;i++){
            System.out.println(vector[i]);
        }
    }
}

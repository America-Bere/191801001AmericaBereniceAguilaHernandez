
//import java.util.ArrayList;
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
public class TestCine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //ArrayList <Pelicula> peliculas=new ArrayList();
        int elegir=0,hora=0;
        boolean res;
        String nomX;
        Cine cine=new Cine("UP", 9, 11);
        System.out.println("Escribe la hora en formato de 24 horas: ");
        hora=scanner.nextInt();
         res=cine.horaCine(hora);
       if(res == true){
            System.out.println("Puedes ingresar al cine");
        }
        else{
            System.out.println("Lo siento, a esa hora esta cerrado el cine");
        }
        do{
            System.out.println("\n1 = Agregar pelicula \t0 = Mostrar peliculas");
            elegir=scanner.nextInt();
            String bufer=scanner.nextLine();
            switch (elegir){
                case 1:
                    System.out.println("\nNombre de la pelicula:");
                    nomX=scanner.nextLine();
                    Pelicula pelicula = new Pelicula(nomX);
                    cine.agregarPelicula(pelicula);
                    //peliculas.add(Nombre);
                break;
                default:System.out.println("Ya no mas\n");
                        System.out.println(cine.totalPelis());
                    break;
            }
        }while(elegir !=0);
          //Cine cine=new Cine("UP", 9, 11, peliculas);
           System.out.println(cine.imprimirPeliculas());
    }
}

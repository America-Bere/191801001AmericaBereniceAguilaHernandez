/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
//import java.util.Scanner;
/**
 *
 * @author Fam. Aguila Hdez
 */
public class CineDos {
    public static void main(String[] args) {
        Pelicula peliculaUno=new Pelicula("Black Widow");
        Pelicula peliculaDos=new Pelicula("Gotzila vs Kong");
        Pelicula peliculaTres=new Pelicula("Loved"); 
        //una lista ligada puede ser de un tipo de variable o de una clase
        ArrayList <Pelicula> peliculas=new ArrayList();
        peliculas.add(peliculaUno);
        peliculas.add(peliculaDos);
        peliculas.add(peliculaTres);
        peliculas.size(); //muestra el numero de objetos en la lista
        
        System.out.println(peliculas.size());
    }
}

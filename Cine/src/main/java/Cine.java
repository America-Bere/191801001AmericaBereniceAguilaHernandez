
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Cine {
    public String nombreCine;
    public int entrada, salida;
    public ArrayList <Pelicula> peliculas=new ArrayList();
    public Cine(String nombreCine, int entrada, int salida, ArrayList <Pelicula> peliculas){
        this.entrada=entrada;
        this.salida=salida;
        this.nombreCine=nombreCine;
        //this.peliculas=peliculas;
    }
    public Cine(){
        
    }
    
    public String  imprimirPeliculas(){
        String cartelera="";
        for(Pelicula pelicula:peliculas){
                cartelera += pelicula.titulo+"\n";
           }
        return cartelera;
    }
    public boolean horaCine(int hora){
        switch(hora){
          case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23:
                return true;
          default:
                  return false;
        }
    }
    //metodo
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public int totalPelis(){
        peliculas.size();
        return peliculas.size();
    }
    public Cine(String nombreCine, int entrada, int salida){
        this.entrada=entrada;
        this.salida=salida;
        this.nombreCine=nombreCine;
    }
    @Override
    public String toString(){
        return "Nombre del cine "+nombreCine;
    }
}

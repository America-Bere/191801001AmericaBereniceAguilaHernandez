
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
public class Pelicula {
    public String titulo,director, genero,casaProductora,clasificacion;
    public int anio;
    public double duracion;
    public boolean subtitulos;
    
    public Pelicula(String titulo, String director, String genero, String casaProductora, String clasificacion, int anio, double duracion, boolean subtitulos){
        this.anio=anio;
        this.casaProductora=casaProductora;
        this.clasificacion=clasificacion;
        this.director=director;
        this.duracion=duracion;
        this.genero=genero;
        this.subtitulos=subtitulos;
        this.titulo=titulo;
    }
    
    public Pelicula(){
        
    }

    public Pelicula(String titulo) {
        this.titulo=titulo;
    }
    
    @Override
    public String toString(){
        return "La pelicula: "+titulo+" del genero "+genero+" con la duracion de "+duracion+"\n";
    }
}

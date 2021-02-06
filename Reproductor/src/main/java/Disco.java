
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
public class Disco {
    public int anio;
    public String nombre;
    public String artista;
    public ArrayList <Cancion> canciones;
    
    public Disco(){
        
    }
    
    public Disco(int anio, String nombre, String artista, ArrayList <Cancion> canciones){
        this.anio=anio;
        this.artista=artista;
        this.canciones=canciones;
        this.nombre=nombre;
    }
    
    @Override
    public String toString(){
        return "El anio: "+anio+"\nArtista "+artista+"\nCanciones: "+canciones+"\nNombre:"+nombre;
    }
    
}

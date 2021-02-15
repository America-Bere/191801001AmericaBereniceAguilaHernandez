
import java.util.ArrayList;
/*
 * @author Fam. Aguila Hdez
 */
public class Cine {
    public String nombreCine;
    public int entrada, salida;
    public ArrayList <Pelicula> peliculas;
    public Cine(String nombreCine, int entrada, int salida, ArrayList <Pelicula> peliculas){
        this.entrada=entrada;
        this.salida=salida;
        this.nombreCine=nombreCine;
       this.peliculas=peliculas;
    }
     public Cine(String nombreCine, int entrada, int salida){
        this.entrada=entrada;
        this.salida=salida;
        this.nombreCine=nombreCine;
        this.peliculas=new ArrayList();
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
        if((hora >= entrada) && (hora <= salida)){
            return true;
        }
        else{
             return false;
        }
    }
    //metodo
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public int totalPelis(){
        return peliculas.size();
    }
    @Override
    public String toString(){
        return "Nombre del cine "+nombreCine;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Cancion {
    public int orden;
    public String titulo;
    public double duracion;
    
    //metodos
    //constructor 
    public Cancion(int orden,String titulo, double duracion){
        this.duracion=duracion;
        this.orden=orden;
        this.titulo=titulo;
    }
        //constructor vacio
        public Cancion(){
            
        }
        
    @Override
        public String toString(){
            return "orden: "+orden+" de la cancion: "+titulo+" con duracion de: "+duracion;
        }
}

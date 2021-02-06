/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Taza {
    //Atributos
    public String color,modelo,material,tamanio;
    public Double precio;
    
    
    //Metodos
    
    //Constructores
    public Taza(String color, String modelo, String material, String tamanio, double precio){
        this.color= color;
        this.modelo=modelo;
        this.material=material;
        this.precio=precio;
        this.tamanio=tamanio;
    }
    public Taza(){
        
    }
    //Metodo toString
    
    @Override
    public String toString(){
        return "La taza de "+material+" es el modelo "+modelo+"\nCon tamanio de "+tamanio+"\ncolor "+color+"\nY cuesta "+precio;
    }
}

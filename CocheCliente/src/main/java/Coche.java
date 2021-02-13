/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Coche {
    public String marca, color;
    public int matricula;
    public double precio;
    
    
    public Coche(String marca,String color, int matricula,double precio){
        this.color=color;
        this.marca=marca;
        this.matricula=matricula;
        this.precio=precio;
    }
    public Coche(){
        
    }
    @Override
    public String toString(){
        return "El auto de la marca "+marca+" de color "+color+"\nTiene la matricula: "+matricula+" con el precio de "+precio+" pesos";
    }
}

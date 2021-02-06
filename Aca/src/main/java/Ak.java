/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Ak {
    
    //atributos
    public String material,disponibilidad; 
    public int municion;
    public double velocidad,danio,precio;
    
    //metodos
    @Override
    public String toString(){
        return "El material del arma es de "+material+" \nCon una disponibilidad de "+disponibilidad+" \nCon una municion de "+municion+"\n Velocidad de disparo "+velocidad+" \nCon un daño de "+danio+" \ny con el precio de "+precio;
    }
}

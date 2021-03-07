/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hardware;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Ram {
    private int capacidad, velocidad;
    private String empresa;
    
    public Ram(int capacidad, int velocidad, String empresa){
        this.capacidad=capacidad;
        this.empresa=empresa;
        this.velocidad=velocidad;
    }
    public Ram(){
        
    }
    
    public int getCapacidad(){
        return this.capacidad + this.velocidad;
    }
    public void setCapacidad(int capacidad, int velocidad){
        this.capacidad=capacidad;
        this.velocidad=velocidad;
    }
    public String getEmpresa(){
        return this.empresa;
    }
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
    
    
    @Override
    public String toString(){
        return "La tarjeta RAM producida por: "+empresa+" tiene la capacidad de "+capacidad+" de RAM, por lo que trabaja con una velocidad de "+velocidad;
    }
}

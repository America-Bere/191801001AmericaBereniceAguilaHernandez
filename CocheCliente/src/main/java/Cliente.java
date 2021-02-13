/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Cliente {
    public int dni,telefono;
    public String nombre;
    public Coche coche;
    public Cliente(int dni, int telefono, String nombre, Coche coche){
        this.dni=dni;
        this.nombre=nombre;
        this.telefono=telefono;
        this.coche=coche;
    }
    public Cliente(){
        
    }
    @Override
    public String toString(){
        return "El cliente "+nombre+" con el dni "+dni+" tiene el telefono: "+telefono+"\nTiene el coche: "+coche;
    }
}

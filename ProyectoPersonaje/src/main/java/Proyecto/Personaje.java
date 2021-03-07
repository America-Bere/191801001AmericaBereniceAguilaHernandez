/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Personaje {
    private String nombre,sexo,clan;
    public Personaje(String nombre, String sexo, String clan){
        this.clan=clan;
        this.nombre=nombre;
        this.sexo=sexo;
    }
    public Personaje(){
        this.clan="";
        this.nombre="";
        this.sexo="";
    }
    @Override
    public String toString(){
        return "El personaje de sexo: "+getSexo()+" tiene como nombre: "+getNombre()+"\nY pertenece al clan: "+getClan();
    }
    
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getClan() {
        return this.clan;
    }
    public void setClan(String clan) {
        this.clan = clan;
    }
}

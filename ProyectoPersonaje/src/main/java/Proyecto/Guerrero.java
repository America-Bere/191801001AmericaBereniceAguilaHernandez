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
public class Guerrero extends Personaje{
    private int ataque,salud;
    private String categoria,habilidad;
    public Guerrero(int ataque, int salud,String habilidad, String categoria,String nombre, int id, String sexo, String clan){
        super(nombre, id, sexo, clan);
        this.ataque=ataque;
        this.salud=salud;
        this.habilidad=habilidad;
        this.categoria=categoria;
    }
    public Guerrero(){
        super();
        this.ataque=0;
        this.salud=0;
        this.habilidad="";
        this.categoria="";
    }
    @Override
    public String toString(){
        return " "+super.getNombre()+" de sexo: "+super.getSexo()+" perteneciente al clan: "+super.getClan()+"\n"+categoria+" cuenta con la habilidad: "+habilidad+"\nCon ataque de: "+ataque+" y de salud: "+salud;
    }


    public int getAtaque() {
        return this.ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getSalud() {
        return this.salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getHabilidad() {
        return this.habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    
}

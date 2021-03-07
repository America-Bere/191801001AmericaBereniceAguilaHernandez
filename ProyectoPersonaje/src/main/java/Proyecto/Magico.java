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
public class Magico extends Guerrero{
    private String hechizo;
    public Magico(String hechizo, int ataque, int salud,String habilidad, String categoria,String nombre, String sexo, String clan){
        super(ataque, salud, habilidad, categoria, nombre, sexo, clan);
        this.hechizo=hechizo;
    }
    public Magico(){
        super();
        this.hechizo="";
    }
    @Override
    public String toString(){
        return " "+super.getNombre()+" de sexo: "+super.getSexo()+" perteneciente al clan: "+super.getClan()+"\n"+super.getCategoria()+" cuenta con la habilidad: "+super.getHabilidad()+"\nCon ataque de: "+super.getAtaque()+" y de salud: "+super.getSalud()+"\nAl pertenecer a esta categoria tiene como extra realizar:"+getHechizo();
    }
    public String getHechizo() {
        return this.hechizo;
    }
    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }   
}

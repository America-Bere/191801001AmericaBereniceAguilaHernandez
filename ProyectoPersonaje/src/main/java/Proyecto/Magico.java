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
    private int id, ataque,salud;
    private String nombre, sexo,clan,categoria,habilidad,hechizo;
    public Magico(int id, String nombre, String sexo, String clan, int ataque, int salud, String habilidad, String categoria, String hechizo){
        super(id,nombre,sexo,clan,ataque, salud, habilidad, categoria);
        this.hechizo=hechizo;
    }
    public Magico(){
        super();
        this.hechizo="";
    }
    @Override
    public String toString(){
        return super.getNombre()+"\n";
    }
    public String imprimir(){
        return " "+super.getNombre()+" de sexo: "+super.getSexo()+" perteneciente al clan: "+super.getClan()+"\n"+super.getCategoria()+" cuenta con la habilidad: "+super.getHabilidad()+"\nCon ataque de: "+super.getAtaque()+" y de salud: "+super.getSalud()+"\nAl pertenecer a esta categoria tiene como extra realizar:"+getHechizo();
    }
    public Magico(String nombre, String sexo, String clan, int ataque, int salud, String habilidad, String categoria,String hechizo) {
        this.nombre=nombre;
        this.sexo=sexo;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
        this.habilidad=habilidad;
        this.categoria=categoria;
        this.hechizo=hechizo;
    }
    public String getHechizo() {
        return this.hechizo;
    }
    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }   
}

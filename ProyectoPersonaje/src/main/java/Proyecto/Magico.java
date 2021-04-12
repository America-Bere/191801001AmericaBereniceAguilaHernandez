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
        this.id=id;
        this.nombre=nombre;
        this.sexo=sexo;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
        this.habilidad=habilidad;
        this.categoria=categoria;
        this.hechizo=hechizo;
    }
    public Magico(){
        super();
        this.hechizo="";
    }
    public Magico(int id){
        this.id=id;
    }
    public Magico(int id,String clan){
        this.id=id;
        this.clan=clan;
    }
    public Magico(int id,String clan,int ataque,int salud){
        this.id=id;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
    }
    @Override
    public String toString(){
        return "<ID: "+id+"> Nombre: "+nombre+" Clan: "+clan+" Ataque: "+ataque+" Salud: "+salud;
    }
    /*public String imprimir(){
        return " "+super.getNombre()+" de sexo: "+super.getSexo()+" perteneciente al clan: "+super.getClan()+"\n"+super.getCategoria()+" cuenta con la habilidad: "+super.getHabilidad()+"\nCon ataque de: "+super.getAtaque()+" y de salud: "+super.getSalud()+"\nAl pertenecer a esta categoria tiene como extra realizar:"+getHechizo();
    }*/
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
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getHechizo() {
        return this.hechizo;
    }
    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }  
}

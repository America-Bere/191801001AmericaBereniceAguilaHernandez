/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public abstract class Personajes {
    private int id, vida;
    private String nombre, raza;
    public Personajes(int id, int vida, String nombre, String raza) {
        this.id = id;
        this.vida = vida;
        this.nombre = nombre;
        this.raza = raza;
    }
    public Personajes(){
        
    }
    @Override
    public String toString() {
        return "Personajes{" + "id=" + getId() + ", vida=" + getVida() + ", nombre=" + getNombre() + ", raza=" + getRaza() + '}';
    }
    
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getVida() {
        return this.vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return this.raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}

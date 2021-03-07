/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Empleado {
    private int id;
    private String nombre, apePa,apeMa;
    public Empleado(int id, String nombre, String apePa, String apeMa){
        this.id=id;
        this.apeMa=apeMa;
        this.apePa=apePa;
        this.nombre=nombre;
    }
    public Empleado(){
        this.id=0;
        this.apePa="";
        this.apeMa="";
        this.nombre="";
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApePa() {
        return this.apePa;
    }
    public void setApePa(String apePa) {
        this.apePa = apePa;
    }
    public String getApeMa() {
        return this.apeMa;
    }
    public void setApeMa(String apeMa) {
        this.apeMa = apeMa;
    }
    
    @Override
    public String toString(){
        return "El empleado "+getNombre()+" "+getApePa()+" "+getApeMa()+" cuenta con el ID: "+getId();
    }
}

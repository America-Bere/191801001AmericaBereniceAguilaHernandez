/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Usuario {
private int id;
    private String nombre,contraseña,fechaDeAlta;
    private int status;
    public Usuario(int id, String nombre, String contraseña, String fechaDeAlta, int status) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaDeAlta = fechaDeAlta;
        this.status = status;
    }
    public Usuario(){
        
    }
    @Override
    public String toString(){
        return "El usuario de nombre: "+nombre+" cuenta con el ID: "+id+"\n Su cuenta se dio de alta: "+fechaDeAlta+"\n tiene de contraseña: "+contraseña+" y esta en estado "+status+"\n\n";
    }    
    public String imprimir(){
        return nombre+"\n ";
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public String getFechaDeAlta() {
        return this.fechaDeAlta;
    }

    public int isStatus() {
        return this.status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFechaDeAlta(String fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setStatus(int status) {
        this.status = status;
    }   
}

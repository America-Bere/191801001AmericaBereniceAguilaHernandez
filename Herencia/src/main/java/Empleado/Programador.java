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
public class Programador extends Empleado{
    private double sueldo;
    public Programador(int id, String nombre, String apePa, String apeMa, double sueldo){
        super(id, nombre, apePa, apeMa);
        this.sueldo=sueldo;
    }
    public Programador(){
        super();
        this.sueldo=0;
    }
}

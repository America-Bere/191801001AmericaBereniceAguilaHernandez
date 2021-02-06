/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestAk {
    public static void main(String[] args) {
        //crear un objeto(instanciar una clase)
        Ak cobre=new Ak(); 
        cobre.material="cobre";
        cobre.disponibilidad="alta";
        cobre.municion=5;
        cobre.precio=10;
        cobre.velocidad=10.5;
        cobre.danio=5;
        
        System.out.println(cobre);
        
        Ak diamante=new Ak(); 
        diamante.material="diamante";
        diamante.disponibilidad="baja";
        diamante.municion=20;
        diamante.precio=12000;
        diamante.velocidad=13;
        diamante.danio=15;
        
        System.out.println(diamante);     
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestTaza {
    public static void main(String[] args) {
        Taza tazaRoja=new Taza();
        tazaRoja.color="rojo";
        tazaRoja.material="plastico";
        tazaRoja.modelo="navideño 2020";
        tazaRoja.tamanio="mediana";
        tazaRoja.precio=350.90;
        
        Taza tazaNaranja= new Taza("naranja","industrial" , "plata", "grande", 119.50);
        System.out.println(tazaNaranja);
        
        
    }
    
}

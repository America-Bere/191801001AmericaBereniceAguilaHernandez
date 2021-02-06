/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class CartasDeBatalla {
    public String habilidad,categoria,disponibilidad,clase;
    public int ataque,saludHP,nivelMaximo;
    
    public String mostrarCaracteristicas(){
        return "La carta de clase "+clase+"\nQue pertenece a la categoria de "+categoria+"\nCon la habilidad de "+habilidad+"\nCon ataque de "+ataque+"\nY con salud de "+saludHP+"\nPuede alcanzar el nivel maximo de "+nivelMaximo+"\nY su disponibilidad es "+disponibilidad+"\n\n";
    }
}

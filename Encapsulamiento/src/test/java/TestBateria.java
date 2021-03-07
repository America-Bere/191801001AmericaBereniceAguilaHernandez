
import Hardware.Bateria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestBateria {
    public static void main(String[] args) {
        //instanciar=crear un objeto
        //partes para instanciar un objeto
        //clase=Bateria         baterialCel=nombre del objeto          new=palabra reservada            
        //Bateria=clase         ()=constructor
        Bateria bateriaCel=new Bateria(100);
        System.out.println(bateriaCel);
        bateriaCel.setPorcentaje(99);
        System.out.println(bateriaCel);
    }   
}

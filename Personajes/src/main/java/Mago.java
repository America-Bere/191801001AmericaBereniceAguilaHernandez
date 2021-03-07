/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Mago extends Personajes{
    private String poder;
    private double danio;

    public Mago(String poder, double danio, int id, int vida, String nombre, String raza) {
        super(id, vida, nombre, raza);
        this.poder = poder;
        this.danio = danio;
    }
    public Mago(){
        
    }

    @Override
    public String toString() {
        return "Mago{" + "poder=" + poder + ", danio=" + danio + '}'+super.toString();
    }

    public String getPoder() {
        return this.poder;
    }

    public double getDanio() {
        return this.danio;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    
}

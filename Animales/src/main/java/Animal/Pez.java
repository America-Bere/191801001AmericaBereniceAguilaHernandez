/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Pez extends Mascota{
    private String nadar;
    public Pez(String nadar, String foto, String comida, String tamanio, String localizacion, String comer, String dormir, String respirar){
        super(foto, comida, tamanio, localizacion, comer, dormir, respirar);
        this.nadar= nadar;
    }
    public Pez(){
        
    }
    public String toString(){
        return super.toString()+"\nY nada: "+getNadar();
    }

    public String getNadar() {
        return nadar;
    }
    public void setNadar(String nadar) {
        this.nadar = nadar;
    }
    
}

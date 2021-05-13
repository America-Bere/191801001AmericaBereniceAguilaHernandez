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
public class Gato extends Mascota {
    private String vacunar;
    public Gato(String vacunar, String foto, String comida, String tamanio, String localizacion, String comer, String dormir, String respirar){
        super(foto, comida, tamanio, localizacion, comer, dormir, respirar);
        this.vacunar=vacunar;
    }
    public Gato(){
        
    }
    public String toString(){
        return super.toString()+"\nVacunado: "+getVacunar();
    }

    public String getVacunar() {
        return vacunar;
    }
    public void setVacunar(String vacunar) {
        this.vacunar = vacunar;
    }
    
}

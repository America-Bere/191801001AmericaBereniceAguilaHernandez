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
public abstract class Mascota extends Animal{
    private String foto, comida, tamanio;
    public Mascota(String foto, String comida, String tamanio, String localizacion, String comer, String dormir, String respirar){
        super(localizacion, comer, dormir, respirar);
        this.comida=comida;
        this.foto=foto;
        this.tamanio=tamanio;
    }
    public Mascota(){
        
    }
    public String toString(){
        return super.toString()+"\nSu comida favorita es: "+getComida()+" Es de tamaño: "+getTamanio()+"\nFoto: "+getFoto();
    }

    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getComida() {
        return comida;
    }
    public void setComida(String comida) {
        this.comida = comida;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
}

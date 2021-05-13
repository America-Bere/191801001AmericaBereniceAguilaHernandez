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
public class Leon extends Animal{
    private String rugir;
    public Leon(String rugir, String localizacion, String comer, String dormir, String respirar){
        super(localizacion, comer, dormir, respirar);
        this.rugir=rugir;
    }
    public Leon(){
        
    }
    public String toString(){
        return super.toString()+" Y ruge: "+getRugir();
    }
    public String getRugir() {
        return rugir;
    }
    public void setRugir(String rugir) {
        this.rugir = rugir;
    }
    
}

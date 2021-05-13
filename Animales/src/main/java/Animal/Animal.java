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
public class Animal {
    private String comer,dormir,respirar;
    private String localizacion;
        public Animal (String localizacion, String comer, String dormir, String respirar){
            this.localizacion= localizacion;
            this.comer= comer;
            this.dormir= dormir;
            this.respirar= respirar;
        }
        public Animal(){
            
        }
        public String toString(){
            return "El animal se localiza en "+getLocalizacion()+"\nCome: "+getComer()+" Duerme: "+getDormir()+" y respira: "+getRespirar();
        }
        
    public String getComer() {
        return comer;
    }
    public void setComer(String comer) {
        this.comer = comer;
    }
    public String getDormir() {
        return dormir;
    }
    public void setDormir(String dormir) {
        this.dormir = dormir;
    }
    public String getRespirar() {
        return respirar;
    }
    public void setRespirar(String respirar) {
        this.respirar = respirar;
    }
    public String getLocalizacion() {
        return localizacion;
    }
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    } 
    }


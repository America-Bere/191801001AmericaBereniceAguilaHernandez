/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class PapasFritas {
    public String sabor, marca,caducidad,nombre,produccion;
    public int codigo,calorias;
    public double precio,cantidad;
    
    public PapasFritas(String sabor, String marca, String caducidad, String produccion,int calorias,int codigo, double precio, double cantidad,String nombre){
        this.cantidad=cantidad;
        this.codigo=codigo;
        this.caducidad=caducidad;
        this.marca=marca;
        this.sabor=sabor;
        this.precio=precio;
        this.nombre=nombre;
        this.produccion=produccion;
        this.calorias=calorias;
    }
    
    public PapasFritas(){
        
    }
    
    @Override
    public String toString(){
        return "Las papas fritas "+nombre+" de sabor "+sabor+"\npertenecen a la marca: "+marca+" con codigo: "+codigo+"\ntiene la cantidad de: "+cantidad+" gramos, con "+calorias+"calorias\nSu precio es de: "+precio+" pesos\ny tiene fecha de caducidad: "+caducidad+" producidas en: "+produccion;
    }
}

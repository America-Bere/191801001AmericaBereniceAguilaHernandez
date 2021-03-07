/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Pedido {
    private int idPedido, dia,anio;
    private String mes;
    public Pedido(int idPedido, int dia, int anio, String mes){
        this.anio=anio;
        this.dia=dia;
        this.idPedido=idPedido;
        this.mes=mes;
    }
    public Pedido(){
        this.anio=0;
        this.dia=0;
        this.idPedido=0;
        this.mes="";
    }
    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia=dia;
    }
    public int getIdPedido(){
        return this.idPedido;
    }
    public void setIdPedido(int idPedido){
        this.idPedido=idPedido;
    }
    public String getMes(){
        return this.mes;
    }
    public void setMes(String mes){
        this.mes=mes;
    }
    @Override
    public String toString(){
        return "El paquete con el ID: "+idPedido+"\nSe estima que su entrega será el dia "+dia+" del mes  "+mes+" del año "+anio+"\n";
    }
}

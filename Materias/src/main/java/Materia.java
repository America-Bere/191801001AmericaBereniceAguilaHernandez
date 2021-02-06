/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Materia {
    public int creditos,codigo,cuatrimestre;
    public String nombre,carrera;

    public Materia(String nombre,String carrera,int cuatrimestre,int codigo,int creditos){
            this.carrera = carrera;
            this.codigo=codigo;
            this.creditos=creditos;
            this.cuatrimestre=cuatrimestre;
            this.nombre=nombre;            
    }

    public Materia(){
    
    }
    
    @Override
    public String toString(){
        return "la materia: "+nombre+" de la carrera "+carrera+" del cuatrimestre "+cuatrimestre+"\ncodigo: "+codigo+"\ncreditos asignados: "+creditos+"\n";      
    }
}

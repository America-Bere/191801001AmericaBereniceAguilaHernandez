package Proyecto;
/**
 * @author Fam. Aguila Hdez
 */
public class Personaje {
    private String nombre,sexo,clan;
    private int id;
    public Personaje(String nombre, int id, String sexo, String clan){
        this.clan=clan;
        this.nombre=nombre;
        this.sexo=sexo;
        this.id=id;
    }
    public Personaje(){
        this.clan="";
        this.nombre="";
        this.sexo="";
        this.id=0;
    }
    @Override
    public String toString(){
        return getNombre()+"\n";
    }
    /*public String imprimir(){
        return "El personaje de sexo: "+getSexo()+" tiene como nombre: "+getNombre()+"\nY pertenece al clan: "+getClan()+"Y tiene como ID: "+getId();
    }*/
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getClan() {
        return this.clan;
    }
    public void setClan(String clan) {
        this.clan = clan;
    }
    public int getId() {
       return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
}

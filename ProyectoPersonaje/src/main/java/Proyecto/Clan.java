package Proyecto;
/**
 * @author Fam. Aguila Hdez
 */
public class Clan {
    private int id, participantes;
    private String nombre;
    public Clan(int id,int participantes, String nombre){
        this.id=id;
        this.participantes=participantes;
        this.nombre=nombre;
    }
    public Clan(String nombre,int participantes){
        this.participantes=participantes;
        this.nombre=nombre;
    }
    public Clan(int id){
        this.id=id;
    }
    public Clan(){
        this.id=0;
        this.participantes=0;
        this.nombre="";
    }

    public Clan(int id, String nombre, int participantes) {
        this.id=id;
        this.participantes=participantes;
        this.nombre=nombre;
    }
    public String toString(){
        return "<ID:  "+getId()+"> Clan: "+getNombre()+" Con un total de "+getParticipantes()+" participantes ";
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getParticipantes() {
        return this.participantes;
    }
    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

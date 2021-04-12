
package Proyecto;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class Guerrero{
    private int id, ataque,salud;
    private String nombre, sexo,clan,categoria,habilidad;
    public Guerrero(int id, String nombre, String sexo, String clan,int ataque, int salud,String habilidad, String categoria){
        this.id=id;
        this.nombre=nombre;
        this.sexo=sexo;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
        this.habilidad=habilidad;
        this.categoria=categoria;
    }
    public Guerrero(){
        super();
        this.ataque=0;
        this.salud=0;
        this.habilidad="";
        this.categoria="";
    }
    public Guerrero(int id){
        this.id=id;
    }
    public Guerrero(int id,String clan){
        this.id=id;
        this.clan=clan;
    }
    public Guerrero(int id,String clan,int ataque,int salud){
        this.id=id;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
    }
    public Guerrero(String clan,int ataque,int salud){
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
    }

    public Guerrero(String nombre, String sexo, String clan, int ataque, int salud, String habilidad, String categoria) {
        this.nombre=nombre;
        this.sexo=sexo;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
        this.habilidad=habilidad;
        this.categoria=categoria;
    }

    @Override
    public String toString(){
        return "<ID: "+id+"> Nombre: "+nombre+" Clan: "+clan+"  Ataque: "+ataque+" Salud: "+salud;
    }
    public String imprimir(){
        return nombre+"  "+id+"  "+sexo+"  "+clan+"  "+categoria+"  "+habilidad+"  "+ataque+" "+salud;
    }
    public int getAtaque() {
        return this.ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getSalud() {
        return this.salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getHabilidad() {
        return this.habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
}

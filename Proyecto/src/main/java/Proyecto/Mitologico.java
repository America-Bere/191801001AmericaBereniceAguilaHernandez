package Proyecto;
/**
 * @author Fam. Aguila Hdez
 */
public class Mitologico {
    private int id, ataque,salud;
    private String nombre, sexo,clan,categoria,habilidad,hechizo,tranformacion;
    public Mitologico(int id, String nombre, String sexo, String clan, int ataque, int salud, String habilidad, String categoria, String hechizo, String transformacion){
        this.id=id;
        this.nombre=nombre;
        this.sexo=sexo;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
        this.habilidad=habilidad;
        this.categoria=categoria;
        this.hechizo=hechizo;
        this.tranformacion=tranformacion;
    }
    public Mitologico(){
        super();
        this.tranformacion="";
    }
    @Override
    public String toString(){
        //return "<ID: "+id+"> Nombre: "+nombre+" Clan: "+clan+" Ataque: "+ataque+" Salud: "+salud;
        return "<ID: "+id+"> Nombre: "+nombre+" Sexo: "+sexo+" Clan: "+clan+"  Ataque: "+ataque+" Salud: "+salud+" Habilidad: "+habilidad+" Ataque: "+ataque+" Categoria: "+categoria+" Hechizo: "+hechizo+" Transformacion: "+tranformacion;
    }
    public Mitologico(int id,String clan){
        this.id=id;
        this.clan=clan;
    }
    public Mitologico(int id,String clan,int ataque,int salud){
        this.id=id;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
    }
    /*@Override
    public String imprimir(){
        return getTranformacion();
    }*/
    public Mitologico(String nombre, String sexo, String clan, int ataque, int salud, String habilidad, String categoria,String hechizo, String transformacion) {
        this.nombre=nombre;
        this.sexo=sexo;
        this.clan=clan;
        this.ataque=ataque;
        this.salud=salud;
        this.habilidad=habilidad;
        this.categoria=categoria;
        this.hechizo=hechizo;
        this.tranformacion=transformacion;
    }
    public Mitologico(int id){
        this.id=id;
    }
    public String getTranformacion() {
        return this.tranformacion;
    }
    public void setTranformacion(String tranformacion) {
        this.tranformacion = tranformacion;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getHechizo() {
        return this.hechizo;
    }
    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }
}

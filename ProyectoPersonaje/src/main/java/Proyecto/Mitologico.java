package Proyecto;
/**
 * @author Fam. Aguila Hdez
 */
public class Mitologico extends Magico{
    private String tranformacion;
    private int id, ataque,salud;
    private String nombre, sexo,clan,categoria,habilidad,hechizo;
    public Mitologico(int id, String nombre, String sexo, String clan, int ataque, int salud, String habilidad, String categoria, String hechizo, String transformacion){
        super(id,nombre,sexo,clan,ataque, salud, habilidad, categoria,hechizo);
        this.tranformacion=tranformacion;
    }
    public Mitologico(){
        super();
        this.tranformacion="";
    }
    @Override
    public String toString(){
        return super.getNombre()+"\n";
    }
    @Override
    public String imprimir(){
        return getTranformacion();
    }
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
    public String getTranformacion() {
        return tranformacion;
    }
    public void setTranformacion(String tranformacion) {
        this.tranformacion = tranformacion;
    }
}

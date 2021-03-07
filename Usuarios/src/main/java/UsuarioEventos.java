/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class UsuarioEventos extends Usuario {
    private int idEvento, idUsuario;
    private String nombreEvento, diaEvento,horaEvento,lugarEvento;
    public UsuarioEventos(int idEvento, int idUsuario, String nombreEvento, String diaEvento, String horaEvento, String lugarEvento,int id, String nombre, String contraseña, String fechaDeAlta, boolean status) {
        super(id, nombre, contraseña, fechaDeAlta, status);
        this.idEvento = id;
        this.idUsuario = idUsuario;
        this.nombreEvento = nombreEvento;
        this.diaEvento = diaEvento;
        this.horaEvento = horaEvento;
        this.lugarEvento = lugarEvento;
    }
    public UsuarioEventos(){
        
    }
    @Override
    public String toString(){
        return "El usuario de nombre: "+super.getNombre()+" cuenta con el ID: "+super.getId()+"\n Su cuenta se dio de alta: "+super.getFechaDeAlta()+"\n tiene de contraseña: "+super.getContraseña()+" y esta en estado "+super.isStatus()+"\nDe igual forma, va a asistir al evento "+nombreEvento+" con ID: "+idEvento+" del usuario "+idUsuario+"\n el evento sera el "+diaEvento+" a la hora "+horaEvento+"\nEn el lugar "+lugarEvento;
    }

    public int getIdEvento() {
        return this.idEvento;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public String getNombreEvento() {
        return this.nombreEvento;
    }

    public String getDiaEvento() {
        return this.diaEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public void setDiaEvento(String diaEvento) {
        this.diaEvento = diaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public String getHoraEvento() {
        return this.horaEvento;
    }

    public String getLugarEvento() {
        return this.lugarEvento;
    }    
}

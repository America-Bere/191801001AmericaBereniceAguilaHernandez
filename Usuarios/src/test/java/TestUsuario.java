/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestUsuario {
    public static void main(String[] args) {
        Usuario persona=new Usuario(123, "Bere Nice", "aymiranosexd", "31-09-2015", true);
        System.out.println(persona);
        UsuarioEventos evento=new UsuarioEventos(58, 123, "bautizo de rosa", "martes 15 de diciembre", "6 pm", "Salon de fiestas Luna Azul", 123, "Bere nice", "aymiranosexd", "31-09-2015", true);
        System.out.println(evento);
    }
}

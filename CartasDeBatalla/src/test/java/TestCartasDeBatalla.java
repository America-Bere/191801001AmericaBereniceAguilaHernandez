/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestCartasDeBatalla {
    public static void main(String[] args) {
        CartasDeBatalla estrellaCinco=new CartasDeBatalla();
        estrellaCinco.clase="Cinco estrellas";
        estrellaCinco.categoria="Deidad";
        estrellaCinco.habilidad="Baja la defensa de todos los enemigos";
        estrellaCinco.ataque=1000;
        estrellaCinco.saludHP=900;
        estrellaCinco.nivelMaximo=90;
        estrellaCinco.disponibilidad="muy baja";
        
        System.out.println(estrellaCinco.mostrarCaracteristicas());
        
        CartasDeBatalla estrellaCuatro=new CartasDeBatalla();
        estrellaCuatro.clase="Cuatro estrellas";
        estrellaCuatro.categoria="Fantasma";
        estrellaCuatro.habilidad="Sube la salud de los miembros del equipo";
        estrellaCuatro.ataque=850;
        estrellaCuatro.saludHP=700;
        estrellaCuatro.nivelMaximo=80;
        estrellaCuatro.disponibilidad="baja";
        
        System.out.println(estrellaCuatro.mostrarCaracteristicas());
        
        CartasDeBatalla estrellaTres=new CartasDeBatalla();
        estrellaTres.clase="Tres estrellas";
        estrellaTres.categoria="Deidad";
        estrellaTres.habilidad="Ataca a una fila de enemigos";
        estrellaTres.ataque=750;
        estrellaTres.saludHP=600;
        estrellaTres.nivelMaximo=70;
        estrellaTres.disponibilidad="media";
        
        System.out.println(estrellaTres.mostrarCaracteristicas());
        
        CartasDeBatalla estrellaDos=new CartasDeBatalla();
        estrellaDos.clase="Dos estrellas";
        estrellaDos.categoria="Fantasma";
        estrellaDos.habilidad="Ataca a dos enemigos que tengan nivel de vida mas alto";
        estrellaDos.ataque=650;
        estrellaDos.saludHP=400;
        estrellaDos.nivelMaximo=60;
        estrellaDos.disponibilidad="alta";
        
        System.out.println(estrellaDos.mostrarCaracteristicas());
        
        CartasDeBatalla estrellaUno=new CartasDeBatalla();
        estrellaUno.clase="Una estrella";
        estrellaUno.categoria="Demonio";
        estrellaUno.habilidad="Ataca a un solo enemigo";
        estrellaUno.ataque=550;
        estrellaUno.saludHP=200;
        estrellaUno.nivelMaximo=50;
        estrellaUno.disponibilidad="muy alta";
        
        System.out.println(estrellaUno.mostrarCaracteristicas());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestPedido {
    public static void main(String[] args) {
        Pedido pedidoHecho=new Pedido(123, 15, 2021, "Julio");
        System.out.println(pedidoHecho);
        pedidoHecho.setAnio(2021);
        pedidoHecho.setDia(21);
        pedidoHecho.setIdPedido(159);
        pedidoHecho.setMes("Diciembre");
        System.out.println(pedidoHecho);
    }
}

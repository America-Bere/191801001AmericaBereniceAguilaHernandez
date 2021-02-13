

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestCliente {
    public static void main(String[] args) {
        Coche coche=new Coche("Suzuki", "negro", 123456, 1500000.9);
        Cliente cliente=new Cliente(123, 654781, "Lu", coche);
        System.out.println(cliente);
    }
}

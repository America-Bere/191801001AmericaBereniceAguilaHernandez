
import Hardware.Ram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
public class TestRam {
    public static void main(String[] args) {
        Ram ramCompu=new Ram(8, 240, "Samsung");
        System.out.println(ramCompu);
        ramCompu.setCapacidad(4, 80);
        ramCompu.setEmpresa("Intel");
        System.out.println(ramCompu);
    }
}

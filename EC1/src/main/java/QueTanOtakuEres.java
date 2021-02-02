/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Fam. Aguila Hdez
 */
public class QueTanOtakuEres {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int puntos=0,res;
        System.out.println("Esta es una encuesta para saber que tan otaku eres\nLet's GO");
        System.out.println("En que anime hay un personaje que se llama Coco:");
        System.out.println("1. Boku no pico\n2. Boku no hero academy\n3. Boku no neko");
        res=scanner.nextInt();
        if(res == 1){
                puntos=+2;
            }
        if(res == 2){
                puntos=+1;                     
             }
        else{
                puntos=+0;
            }
        res=0;
        System.out.println("Que significan las siglas AFO:");
        System.out.println("1. One For All\n2. All For One\n3. For One All");
        res=scanner.nextInt();
        if(res == 1){
                puntos+=1;
            }
        if(res == 2){
                puntos+=2;                     
             }
        else{
                puntos+=0;
            }
        res=0;
        System.out.println("Como se llama el genero de chico x chico:");
        System.out.println("1. Yaoi\n2. Yuri\n3. Gore");
        res=scanner.nextInt();
        if(res == 1){
                puntos+=2;
            }
        if(res == 2){
                puntos+=1;                     
             }
        else{
                puntos+=0;
            }
        res=0;
        System.out.println("HASHIRE SORI YO\nKAZE NO YOU NI\nTSUKIMIHARA WO...");
        System.out.println("1. Padoru\n2. Hey Hey\n3. Padoru Padoru");
        res=scanner.nextInt();
        if(res == 1){
                puntos+=1;
            }
        if(res == 2){
                puntos+=0;                     
             }
        else{
                puntos+=2;
            }
        res=0;
        System.out.println("Jotaro...");
        System.out.println("1. Oh\n2. Dio\n3. Ure");
        res=scanner.nextInt();
        if(res == 1){
                puntos+=1;
            }
        if(res == 2){
                puntos+=2;                     
             }
        else{
                puntos+=0;
            }
       if(puntos <= 10 && puntos >= 8){
            System.out.println("Eres otaku\nYa bañate");
            System.out.println("_____________________¶¶____¶¶____¶¶\n" +
                                           "_____________________¶¶____¶¶____¶¶\n" +
                                           "______________¶¶______¶¶____¶¶____¶¶\n" +
                                           "_______________¶¶¶¶_____¶¶____¶¶____¶¶\n" +
                                           "__________¶¶______¶¶_________________¶¶\n" +
                                           "___________¶¶¶¶________________________¶¶\n" +
                                           "_____________¶¶¶___________¶¶_________¶¶\n" +
                                           "______________¶¶_____¶¶_____¶¶______¶¶\n" +
                                           "_______________¶¶_____¶¶____________¶¶\n" +
                                           "_______________¶¶___________________¶¶\n" +
                                           "__¶¶___¶¶______¶¶____________¶¶_____¶¶\n" +
                                           "___¶¶__¶¶______¶¶____¶¶_____¶¶_____¶¶\n" +
                                           "____¶¶_¶¶_______¶¶______¶¶¶¶¶_____¶¶\n" +
                                           "___¶¶¶¶¶¶¶_______¶¶______________¶¶\n" +
                                           "__¶¶¶¶¶¶¶¶¶¶_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶\n" +
                                           "__¶¶¶¶¶¶¶¶¶¶___________¶¶___________¶¶\n" +
                                           "____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________¶¶\n" +
                                           "_______________________¶¶_____________¶¶\n");
        }
        if(puntos <= 7 && puntos >= 3){
            System.out.println("Aun estas a tiempo de salvarte\nY mucho mas de conocer el mundo del yaoi :3\n");
            System.out.println("+JD_________________+JD0______\n" +
                                            "_+JD0_______________++JD______\n" +
                                            "_++JD______________+JD0_______\n" +
                                            "_++JD_____________++JD________\n" +
                                            "__+JD0___________++JD8________\n" +
                                            "__+JD8_________++JD0__________\n" +
                                            "__++JD0_______++JD0___________\n" +
                                            "__++JD8_____+++JD0____________\n" +
                                            "__++JDJD__+++JDJD++88_________\n" +
                                            "__+++JDJD+++JDJD++JDJD________\n" +
                                            "___++888JD8888JD++8JDJD8+80___\n" +
                                            "___++88++8888++8888888++888___\n" +
                                            "____++++++JDJDJDJDJDJDJDJD8___\n" +
                                            "____++++++++000JDJDJDJDJDJD___\n" +
                                            "_____+++++++0000JDJDJDJDJDJD__\n" +
                                            "______+++++++000JDJDJDJDJD8___\n" +
                                            "_______+++++++0JDJDJDJDJD8____\n" +
                                            "_______+++++++0JDJDJDJDJD8____\n" +
                                            "________+++++++JDJDJDJDJD_____\n" +
                                            "________+++++++00JDJDJDJD_____\n" +
                                            "________++++++00JDJDJDJD______\n");
        }
        if(puntos == 0 || puntos == 1 || puntos == 2){
            System.out.println("Que bueno que no eres Otaku\nSigue asi UuU\nToma mucha awa");
            System.out.println("_000000___00000___\n" +
                                           "00000000_0000000___\n" +
                                           "0000000000000000____\n" +
                                           "_00000000000000_____\n" +
                                           "___00000000000_____\n" +
                                           "______00000_______\n" +
                                           "________0________\n");
        }
        System.out.println("Puntaje total: "+puntos);
    }
}

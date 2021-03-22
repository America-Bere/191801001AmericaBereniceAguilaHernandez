/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fam. Aguila Hdez
 */
import java.sql.*;

public class Eventos {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/usuarioevento?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //crear conexion con base de datos
            Connection ConexionDos=DriverManager.getConnection(url,"root","");
            //crear una declaracion de como se va a trabajar en la base de datos
            Statement declaracionDos=ConexionDos.createStatement();
            String SQL="SELECT * FROM usuarios";
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            ResultSet resultadoDos=declaracionDos.executeQuery(SQL);
           
            //imprimir valores
            while(resultadoDos.next())
            {   //System.out.println(resultado.getString("id"));
                System.out.println(resultadoDos.getInt("id"));
                System.out.println(resultadoDos.getInt("id_usuario"));
                System.out.println(resultadoDos.getString("nombre_evento"));
                System.out.println(resultadoDos.getString("lugar_evento"));
                System.out.println(resultadoDos.getDate("dia_evento"));
                //System.out.println(resultadoDos.getTime("hora_evento"));
                System.out.println("\n\n");
                
            }
            resultadoDos.close();
            declaracionDos.close();
            ConexionDos.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}

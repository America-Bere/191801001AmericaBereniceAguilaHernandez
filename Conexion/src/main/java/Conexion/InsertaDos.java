/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class InsertaDos {
     private static final String URL="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        private static final String USUARIO = "root", PASSWORD = "";
        public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
            //throws SQLException es el try y catch implementado en un metodo
        }
}

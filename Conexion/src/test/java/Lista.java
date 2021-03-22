
import java.sql.*;
//import Conexion.Conexion;
import DaoUsuarios.DaoUsuario;
import Usuarios.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) throws SQLException{
        List<Usuario> listUsuarios=new ArrayList<>();
        listUsuarios=DaoUsuario.listaUsuarios();
        for (Iterator<Usuario> it = listUsuarios.iterator(); it.hasNext();) {
            Usuario usuario = it.next();
            System.out.println(usuario);
        }
    }

    /*private static Iterable<Usuario> listUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
        //String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        //try{
            //crear conexion con base de datos
            //Connection Lista=DriverManager.getConnection(url,"root","");
            /*Connection conexion = Conexion.getConnection();
            //crear una declaracion de como se va a trabajar en la base de datos
            Statement declaracion=conexion.createStatement();
            String SQL="SELECT * FROM usuarios";
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            ResultSet resultado=declaracion.executeQuery(SQL);*/
           
            //imprimir valores
            /*while(resultado.next())
            {   //System.out.println(resultado.getString("id"));
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("contraseña"));
                System.out.println(resultado.getInt("status"));
                System.out.println(resultado.getDate("fecha_de_alta"));
                System.out.println("\n\n");
                //System.out.println(resultado.getInt("id_usuario"));
            }*/
            //Conexion.close(conexion,declaracion,resultado);
            /*Conexion.close(conexion);
            Conexion.close(declaracion);
            Conexion.close(resultado);*/
            //Conexion.close(declaracion,conexion,resultado);
            /*resultado.close();
            declaracion.close();
            Conexion.close();*/
            
       // }
         /*Conexion.close(conexion);
            Conexion.close(declaracion);
            Conexion.close(resultado);catch(SQLException ex){
            ex.printStackTrace(System.out);*/
        //}



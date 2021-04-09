package DaoUsuarios;

import Conexion.Conexion;
import Usuarios.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fam. Aguila Hdez
 */
public class DaoUsuario {
    //public static void main(String[] args) {
        
        private static String SQL;
        
        public static List<Usuario> listaUsuarios () throws SQLException{
            List<Usuario> listUsuarios=new ArrayList<>();
            Connection conexion = Conexion.getConnection();
            Statement declaracion=conexion.createStatement();
            SQL="SELECT * FROM usuarios";
            ResultSet resultado=declaracion.executeQuery(SQL);
            while(resultado.next()){   
                //Usuario usuario=new Usuario(resultado.getString("nombre"));
                Usuario usuario=new Usuario(resultado.getInt("id"), resultado.getString("nombre"), resultado.getString("contraseña"), resultado.getString("fecha_de_alta"), resultado.getInt("status"));
                listUsuarios.add(usuario);
            }
            Conexion.close(conexion, declaracion);
            return listUsuarios;
        }
        public static void insertar(Usuario usuario) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="INSERT INTO usuarios (nombre,contraseña,status) VALUES (?,?,?)";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getNombre());
            declaracion.setString(2, usuario.getContraseña());
            declaracion.setInt(3, 1);
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
        public static void eliminar(Usuario usuario) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="DELETE FROM usuarios WHERE id=? ";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setInt(1, usuario.getId());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
        public static void actualizar(Usuario usuario) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="UPDATE  usuarios SET nombre = ?, contraseña = ? WHERE id=?";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getNombre());
            declaracion.setString(2, usuario.getContraseña());
            declaracion.setInt(3, usuario.getId());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
}

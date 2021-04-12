/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClanes;

import Conexion.Conexion;
import Proyecto.Clan;
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
public class DaoClan {
    private static String SQL;
    public static List<Clan> asistenciaClan () throws SQLException{
            List<Clan> listClanes=new ArrayList<>();
            Connection conexion = Conexion.getConnection();
            Statement declaracion=conexion.createStatement();
            SQL="SELECT * FROM clan";
            ResultSet resultado=declaracion.executeQuery(SQL);
            while(resultado.next()){  
                Clan personajeClan=new Clan(resultado.getInt("id"), resultado.getInt("participantes"),resultado.getString("nombre"));
                listClanes.add(personajeClan);
            }
            Conexion.close(conexion, declaracion);
            return listClanes;
     }
    public static void insertar(Clan clan) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="INSERT INTO clan (nombre,participantes) VALUES (?,?)";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setString(1, clan.getNombre());
            declaracion.setInt(2, clan.getParticipantes());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
    public static void eliminar(Clan clan) throws SQLException{
            Connection conexion = Conexion.getConnection();
            SQL="DELETE FROM clan WHERE id=? ";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            declaracion.setInt(1, clan.getId());
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
    public static void actualizar(Clan clan) throws SQLException{
           Connection conexion = Conexion.getConnection();
           SQL = "UPDATE clan SET nombre = ?,participantes=? WHERE id = ?";
           PreparedStatement declaracion = conexion.prepareStatement(SQL);
           declaracion.setString(1, clan.getNombre());
           declaracion.setInt(2, clan.getParticipantes());
           declaracion.setInt(3, clan.getId());
           declaracion.executeUpdate();
           Conexion.close(conexion, declaracion);
        }
}

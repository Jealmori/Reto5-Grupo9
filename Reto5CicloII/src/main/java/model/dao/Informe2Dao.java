/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import java.sql.*;
import util.JDBCUtilities;

public class Informe2Dao {
    public static ResultSet consulta() {
        Statement stmt= null;
        ResultSet rs=null;
        try {

            var conn=JDBCUtilities.getConnection();
            String csql="""
            SELECT id_proyecto , constructora , numero_habitaciones , ciudad 
            FROM Proyecto
            Where Proyecto.clasificacion = "Casa Campestre" AND ciudad in ( "Santa Marta", "Cartagena","Barranquilla") """;
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e);
        }

        return rs;
    }    
}

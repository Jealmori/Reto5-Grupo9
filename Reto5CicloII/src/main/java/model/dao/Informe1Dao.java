/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import java.sql.*;
import util.JDBCUtilities;

public class Informe1Dao {
    
    public static ResultSet consulta(){
        Statement stmt= null;
        ResultSet rs=null;
        try {
            
            Connection conn=JDBCUtilities.getConnection();
            String csql="""
            SELECT id_lider AS ID , nombre ||" "|| primer_apellido ||" "|| segundo_apellido AS LIDER ,ciudad_residencia as Ciudad
            FROM Lider
            ORDER BY Ciudad """;
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return rs;
    }
    
}

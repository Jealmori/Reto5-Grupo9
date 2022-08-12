/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;
import java.sql.*;
import util.JDBCUtilities;

public class Informe3Dao {
    public static ResultSet consulta(){
        Statement stmt= null;
        ResultSet rs=null;
        try {
            var conn=JDBCUtilities.getConnection();
            String csql="""
            SELECT id_compra AS "ID Compra" ,constructora, banco_vinculado AS Banco
            FROM Proyecto  
            INNER JOIN Compra ON Proyecto.id_proyecto = Compra.id_proyecto
            WHERE proveedor = "Homecenter" AND ciudad = "Salento" """;
            stmt=conn.createStatement();
            rs=stmt.executeQuery(csql);

            
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        return rs;
    }    
}

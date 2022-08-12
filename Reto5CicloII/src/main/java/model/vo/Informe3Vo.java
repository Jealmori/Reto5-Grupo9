/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.vo;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import model.dao.*;
/**
 *
 * @author jealm_000
 */
public class Informe3Vo {
    public static DefaultTableModel valores(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Compra");
        modelo.addColumn("Constructora");
        modelo.addColumn("Banco");
       try {   
            ResultSet rs=Informe3Dao.consulta();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            while(rs.next()){
                Object[] filas = new Object [cantidadColumnas];

                for (int i = 0;i< cantidadColumnas;i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
                }
            }catch (SQLException e){
            System.err.println(e.toString());
        }
        return modelo;        
       
    }    
}

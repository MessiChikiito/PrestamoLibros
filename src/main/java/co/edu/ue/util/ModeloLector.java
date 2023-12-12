/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ue.util;

import co.edu.ue.entidades.Lectores;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloLector {
    
    public ArrayList<Lectores> getLectores(){
        Conexion conexion = new Conexion(); // Crear una instancia de la clase Conexion
        Connection con = conexion.getConectar();
        Statement stmt;
        ResultSet rs;
        ArrayList<Lectores> listaLectores = new ArrayList<>();
    
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM autores");
            
            while(rs.next()){
                Lectores lectores = new Lectores();
                lectores.setLect_id(rs.getInt("id"));
                lectores.setLect_nombre(rs.getString("nombre"));
                lectores.setLect_apellido(rs.getString("apellido"));
                listaLectores.add(lectores);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLector.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Cerrar la conexión aquí si es necesario
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listaLectores;
    }
}

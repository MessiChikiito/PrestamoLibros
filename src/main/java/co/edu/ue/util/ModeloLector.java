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

    public ArrayList<Lectores> getLectores() {
        Conexion conexion = new Conexion(); // Crear una instancia de la clase Conexion
        Connection con = conexion.getConectar();
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Lectores> listaLectores = new ArrayList<>();

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM lectores"); // Actualizar el nombre de la tabla a "lectores"

            while (rs.next()) {
                Lectores lectores = new Lectores();
                lectores.setLect_id(rs.getInt("lect_id"));
                lectores.setLect_nombre(rs.getString("lect_nombre"));
                lectores.setLect_apellido(rs.getString("lect_apellido"));
                lectores.setLect_direccion(rs.getString("lect_direccion"));
                lectores.setLect_telefono(rs.getString("lect_telefono"));
                lectores.setLect_documento(rs.getString("lect_documento"));
                lectores.setLect_email(rs.getString("lect_email"));
                
                listaLectores.add(lectores);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloLector.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Cerrar recursos en un bloque finally
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
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
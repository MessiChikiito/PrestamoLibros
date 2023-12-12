
package co.edu.ue.util;

import co.edu.ue.entidades.Editoriales;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloEditorial {


    public ArrayList<Editoriales> getEditoriales() {
        Conexion conexion = new Conexion(); // Crear una instancia de la clase Conexion
        Connection con = conexion.getConectar();
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Editoriales> listaEditoriales = new ArrayList<>();

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM editoriales"); // Actualizar el nombre de la tabla a "lectores"

            while (rs.next()) {
                Editoriales editoriales = new Editoriales();
                editoriales.setEdit_id(rs.getInt("edit_id"));
                editoriales.setEdit_nombre(rs.getString("edit_nombre"));
                listaEditoriales.add(editoriales);
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
        return listaEditoriales;
    }
    
}

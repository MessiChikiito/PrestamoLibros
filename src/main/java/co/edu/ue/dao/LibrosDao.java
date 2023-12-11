package co.edu.ue.dao;

import co.edu.ue.entidades.Libros;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LibrosDao {
    Conexion conexion;
    PreparedStatement statement;

    public LibrosDao(){
        conexion = new Conexion ();
        this.statement = null;
    }
    public Libros addUser(Libros user) throws SQLException{
        Connection conex = this.conexion.getConectar();
        String query = "INSERT datos VALUES(null,?,?);";

        try {
            if (this.statement == null){
                this.statement = conex.prepareStatement(query);
                this.statement.setString(1, user.getLibr_titulo());
                this.statement.setInt(2, user.getEdit_id());
                int response = this.statement.executeUpdate();
                if(response > 0)
                    JOptionPane.showMessageDialog(null, "Se ha registrado el libro");
            }
        } catch (Exception e) {
            System.out.println(""+e.getMessage());
        } finally {
            if(conex != null){
                try {
                    this.statement.close();
                    conex.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


}
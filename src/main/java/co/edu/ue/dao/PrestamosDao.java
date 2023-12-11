package co.edu.ue.dao;

import co.edu.ue.entidades.Prestamos;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PrestamosDao {
    Conexion conexion;
    PreparedStatement statement;
    
    public PrestamosDao(){
        conexion = new Conexion ();
        this.statement = null;
    }
    public Prestamos addUser(Prestamos user) throws SQLException{
        Connection conex = this.conexion.getConectar();
        String query = "INSERT datos VALUES(null, ?,?,?,?,?);";
        
        try {
            if (this.statement == null){
                this.statement = conex.prepareStatement(query);
                this.statement.setDate(1, user.getPrest_fecha());
                this.statement.setDate(2, user.getPrest_fecha_devolucion());
                this.statement.setInt(3, user.getLect_id());
                this.statement.setInt(4, user.getLibr_codigo());
                this.statement.setInt(5, user.getUsur_id());
                
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

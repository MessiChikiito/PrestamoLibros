package co.edu.ue.dao;

import co.edu.ue.entidades.Lectores;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LectoresDao {
    Conexion conexion;
    PreparedStatement statement;
    
    public LectoresDao(){
        conexion = new Conexion ();
        this.statement = null;
    }
    public Lectores addUser(Lectores user) throws SQLException{
        Connection conex = this.conexion.getConectar();
        String query = "INSERT lectores VALUES(null, ?,?,?,?,?,?);";
        
        try {
            if (this.statement == null){
                this.statement = conex.prepareStatement(query);
                this.statement.setString(1, user.getLect_nombre());
                this.statement.setString(2, user.getLect_apellido());
                this.statement.setString(3, user.getLect_direccion());
                this.statement.setInt(4, user.getLect_telefono());
                this.statement.setInt(5, user.getLect_documento());
                this.statement.setString(6, user.getLect_email());
                int response = this.statement.executeUpdate();
                if(response > 0)
                    JOptionPane.showMessageDialog(null, "Se ha registrado el lector");
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
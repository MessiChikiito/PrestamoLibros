
package co.edu.ue.dao;

import co.edu.ue.entidades.Autores;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AutoresDao {
    Conexion conexion;
    PreparedStatement statement;
    
    public AutoresDao(){
        conexion = new Conexion ();
        this.statement = null;
    }
    public Autores addUser(Autores user) throws SQLException{
        Connection conex = this.conexion.getConectar();
        String query = "INSERT autores VALUES(null, ?,?);";
        
        try {
            if (this.statement == null){
                this.statement = conex.prepareStatement(query);
                this.statement.setString(1, user.getAut_nombre());
                this.statement.setString(2, user.getAut_apellido());
                int response = this.statement.executeUpdate();
                if(response > 0)
                    JOptionPane.showMessageDialog(null, "Se ha registrado el autor");
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

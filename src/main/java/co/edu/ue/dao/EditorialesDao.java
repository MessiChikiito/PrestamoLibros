
package co.edu.ue.dao;

import co.edu.ue.entidades.Editoriales;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditorialesDao {
    Conexion conexion;
    PreparedStatement statement;
    
    public EditorialesDao(){
        conexion = new Conexion ();
        this.statement = null;
    }
    public Editoriales addUser(Editoriales user) throws SQLException{
        Connection conex = this.conexion.getConectar();
        String query = "INSERT datos VALUES(null, ?);";
        
        try {
            if (this.statement == null){
                this.statement = conex.prepareStatement(query);
                this.statement.setString(1, user.getEdit_nombre());
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

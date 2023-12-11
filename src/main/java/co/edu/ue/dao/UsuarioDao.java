package co.edu.ue.dao;

import co.edu.ue.entidades.Usuarios;
import co.edu.ue.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDao {
    Conexion conexion;
    PreparedStatement statement;

    public UsuarioDao (){
        conexion = new Conexion ();
        this.statement = null;
    }
    public Usuarios addUser(Usuarios user) throws SQLException{
        Connection conex = this.conexion.getConectar();
        String query = "INSERT datos VALUES(null,?,?,?,?,?);";

        try {
            if (this.statement == null){
                this.statement = conex.prepareStatement(query);
                this.statement.setString(1, user.getUsur_nombres());
                this.statement.setString(2, user.getUsur_apellidos());
                this.statement.setString(3, user.getUsur_email());
                this.statement.setString(4, user.getUsur_contraseña());
                this.statement.setString(5, user.getUsur_documento());
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

package co.edu.ue.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    public static Statement createSatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String user;
    private String pass;
    private String dataBase;
    private String port;
    private String server;
    private String cadConexion;
    Connection con;
    
    public Conexion(){
        this.user = "root";
        this.pass = "";
        this.dataBase = "prestamolibros";
        this.port = "3306";
        this.server = "localhost";
        this.cadConexion = "jdbc:mysql://"+ this.server + ":"+ this.port + "/" + this.dataBase;
        this.con = null;
    }
    
    private Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection(this.cadConexion, this.user, this.pass);
            JOptionPane.showMessageDialog(null, "Hay conexión");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no hay conexión"+e.toString());
        }
        return this.con;
    }
    
    public Connection getConectar(){
        return this.conectar();
    }
    
}

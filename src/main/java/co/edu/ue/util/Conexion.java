
package co.edu.ue.util;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no hay conexión"+e.toString());
        }
        return this.con;
    }
    
    public Connection getConectar(){
        return this.conectar();
    }
    
}

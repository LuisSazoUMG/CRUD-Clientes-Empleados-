package modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author Luis Sazo
 */
public class Conexion {

    public Connection conexionBD;
    public final String baseDatos = "practica";
    public final String usuario = "usr_practica";
    public final String clave = "UMG";
    public final String urlConexion = String.format("jdbc:mysql://localhost:3306/%s", baseDatos);
    public final String jdbc = "com.mysql.cj.jdbc.Driver";

    // Metodo para conectar
    public void Conectar(){
        try{
            Class.forName(jdbc);
            this.conexionBD = DriverManager.getConnection(urlConexion, usuario, clave);
            JOptionPane.showMessageDialog(null, "Cargando... " + baseDatos);
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se ha conectado a base de datos " + baseDatos + e.getMessage());
        }
    }
    
    // Metodo para desconectar
    public void Desconectar(){
        try{
            this.conexionBD.close();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se ha desconectado de base de datos " + baseDatos + e.getMessage());
        }
    }
}

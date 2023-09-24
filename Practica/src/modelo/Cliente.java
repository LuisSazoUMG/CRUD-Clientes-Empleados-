package modelo;

import java.awt.HeadlessException;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.*;
import java.sql.ResultSet;

/**
 *
 * @author Luis Sazo
 */
public class Cliente extends Persona {

    // Atributos
    private String nit;
    private int id;
    Conexion cn;

    // Metodo constructor vacio
    public Cliente() {

    }

    // Metodo constructor parametros
    public Cliente(int id, String nit, String nombres, String apellidos, String telefono) {
        super(nombres, apellidos, telefono);
        this.nit = nit;
        this.id = id;
    }

    // Getter and Setter
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    // CRUD
    @Override
    public void Agregar() {
        try {
            PreparedStatement parametro;
            String querty = "";
            querty = "INSERT INTO clientes(Nit, Nombres, Apellidos, Telefono) VALUES(?,?,?,?)";
            cn = new Conexion();
            cn.Conectar();
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
            parametro.setString(1, this.getNit());
            parametro.setString(2, this.getNombres());
            parametro.setString(3, this.getApellidos());
            parametro.setString(4, this.getTelefono());

            int ejecutar = parametro.executeUpdate();
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, "Se agrego " + Integer.toString(ejecutar) + " Registro");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el registro " + e.getMessage());
        }
    }

    @Override
    public DefaultTableModel Leer() {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.Conectar();
            String querty = "";
            querty = "SELECT Id_cliente, Nit, Nombres, Apellidos, Telefono FROM clientes";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(querty);

            // crear tabla (Columnas)
            String campos[] = {"Id_Cliente", "Nit", "Nombres", "Apellidos", "Telefono"};
            tabla.setColumnIdentifiers(campos);

            // Registros (Filas)
            String registros[] = new String[5];
            while (consulta.next()) {
                registros[0] = consulta.getString("Id_cliente");
                registros[1] = consulta.getString("Nit");
                registros[2] = consulta.getString("Nombres");
                registros[3] = consulta.getString("Apellidos");
                registros[4] = consulta.getString("Telefono");
                tabla.addRow(registros);
            }
            cn.Desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se realizo la consulta...", "Leer", JOptionPane.INFORMATION_MESSAGE);
        }

        return tabla;
    }
    
    @Override
    public void Actualizar(){
        try{
             PreparedStatement parametro;
             String querty = "";
             querty = "UPDATE clientes set Nit = ?, Nombres = ?, Apellidos = ?, Telefono = ? WHERE Id_cliente = ?";
             cn = new Conexion();
             cn.Conectar();
             parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
             parametro.setString(1, this.getNit());
             parametro.setString(2, this.getNombres());
             parametro.setString(3, this.getApellidos());
             parametro.setString(4, this.getTelefono());
             parametro.setInt(5, this.getId());
             
             int ejecutar = parametro.executeUpdate();
             cn.Desconectar();
             JOptionPane.showMessageDialog(null, "Se actualizo " + Integer.toHexString(ejecutar) + " Registro ");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se actualizo el registro " + e.getMessage());
        }
    }
    
    @Override
    public void Eliminar(){
        try{
           PreparedStatement parametro;
           String querty = "";
           querty = "DELETE FROM clientes WHERE Id_cliente = ?";
           cn = new Conexion();
           cn.Conectar();
           parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
           parametro.setInt(1, this.getId());
           
           int ejecutar = parametro.executeUpdate();
           cn.Desconectar();
           JOptionPane.showMessageDialog(null, "Se elimino " + Integer.toString(ejecutar) + " Registro ");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "No se elimino el registro " + e.getMessage());
        }
    }
}

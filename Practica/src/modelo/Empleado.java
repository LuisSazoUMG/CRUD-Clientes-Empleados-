package modelo;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Sazo
 */
public class Empleado extends Persona {

    Conexion cn;
    private String codigo;
    private int id, idPuesto;

    // Metodo constructor vacio
    public Empleado() {
    }

    // Metodo constructor parametros
    public Empleado(String codigo, int id, int idPuesto, String nombres, String apellidos, String telefono) {
        super(nombres, apellidos, telefono);
        this.codigo = codigo;
        this.id = id;
        this.idPuesto = idPuesto;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // CRUD
    @Override
    public void Agregar() {
        try {
            PreparedStatement parametro;
            String querty = "";
            querty = "INSERT INTO empleados(Codigo, Nombres, Apellidos, Telefono, Id_Puesto) VALUES(?,?,?,?,?)";
            cn = new Conexion();
            cn.Conectar();
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
            parametro.setString(1, this.getCodigo());
            parametro.setString(2, this.getNombres());
            parametro.setString(3, this.getApellidos());
            parametro.setString(4, this.getTelefono());
            parametro.setInt(5, this.getIdPuesto());

            int ejecutar = parametro.executeUpdate();
            cn.Desconectar();
            JOptionPane.showMessageDialog(null, "Se agrego " + Integer.toString(ejecutar) + " Registro");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ingreso el registro " + e.getMessage());
        }
    }

    // Metodo para manejar el comboBox
    public DefaultComboBoxModel leerPuesto() {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        try {
            cn = new Conexion();
            cn.Conectar();
            String querty = "";
            querty = "SELECT Id_puesto as id, Puesto FROM puestos";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(querty);
            combo.addElement("0) Elija Puesto");
            while (consulta.next()) {
                combo.addElement(consulta.getString("id") + ") " + consulta.getString("Puesto"));
            }
            cn.Desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro", "ComboBox", JOptionPane.INFORMATION_MESSAGE);
        }
        return combo;
    }

    @Override
    public DefaultTableModel Leer() {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.Conectar();
            String querty = "";
            
            // e. hace referencia a la tabla empleados solo que es un alias, para reducir codigo
            querty = "SELECT e.Id_empleado as id ,e.Codigo, e.Nombres, e.Apellidos, e.Telefono, "
                    + "concat(p.Id_puesto,') ', p.Puesto) as puesto FROM  empleados "
                    + "as e inner join puestos as p on e.Id_puesto = p.Id_puesto;";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(querty);

            // Definir la tabla
            // campos (columnas)
            String campos[] = {"Id", "Codigo", "Nombres", "Apellidos", "Telefono", "Puesto"};
            tabla.setColumnIdentifiers(campos);
            
            // registros (filas)
            String registros[] = new String[6];
            while (consulta.next()) {
                registros[0] = consulta.getString("id");
                registros[1] = consulta.getString("Codigo");
                registros[2] = consulta.getString("Nombres");
                registros[3] = consulta.getString("Apellidos");
                registros[4] = consulta.getString("Telefono");
                registros[5] = consulta.getString("Puesto");
                tabla.addRow(registros);
            }
            cn.Desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se realizo la consulta", "SELECT", JOptionPane.INFORMATION_MESSAGE);
        }
        return tabla;
    }

    @Override
    public void Actualizar() {
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.Conectar();
            String querty = "";
            querty = "UPDATE empleados set Codigo = ?, Nombres = ?, Apellidos = ?, Telefono = ?, Id_Puesto = ? WHERE Id_empleado = ?";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
            parametro.setString(1, this.getCodigo());
            parametro.setString(2, this.getNombres());
            parametro.setString(3, this.getApellidos());
            parametro.setString(4, this.getTelefono());
            parametro.setInt(5, this.getIdPuesto());
            parametro.setInt(6, this.getId());
            int ejecutar = parametro.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se actualizo " + Integer.toString(ejecutar) + " Registro");
            cn.Desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se actualizo el registro " + e.getMessage());
        }
    }

    @Override
    public void Eliminar() {
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.Conectar();
            String querty;
            querty = "DELETE FROM empleados where Id_empleado = ?;";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
            parametro.setInt(1, getId());
            int executar = parametro.executeUpdate();
            JOptionPane.showMessageDialog(null, " Se Elimino :" + Integer.toString(executar) + " Registro");
            cn.Desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se actualizo el regsitro " + e.getMessage());
        }
    }
}

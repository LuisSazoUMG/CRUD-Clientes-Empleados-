package modelo;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Luis Sazo
 */
abstract class Persona {
    // Atributos
    private String nombres = "";
    private String apellidos = "";
    private String telefono = "";
    
    // Metodo constructor vacio
    public Persona(){
        
    }
    // Metodo constructor parametros
    public Persona(String nombres, String apellidos, String telefono){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    
    // Getters and Setters
    public String getNombres(){
        return nombres;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    // Crud
    public void Agregar(){
    }
    public DefaultTableModel Leer(){
        return null;
    }
    public void Actualizar(){
    }
    public void Eliminar(){
    }
}
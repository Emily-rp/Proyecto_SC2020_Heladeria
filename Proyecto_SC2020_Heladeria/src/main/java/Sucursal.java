
import javax.swing.JOptionPane;

/* en las sucursales tendremos como maximos 2 
/**
 *
 * @author emily
 */
public class Sucursal {

    private String nombre = "Dulce Tropic";
    private String direccion = "Barrio Escalante, 10101, Escalante, San José Province";
    private String telefono = " 4081-8813";
    private String encargadoNombre;
    private String encargadoapellido;
    private String horario = "Lunes - Viernes: 11:00 am a 8:00pm "
            + "\nSábado y Domigo: 8:00am a 8:00pm";
    

    public Sucursal() {
    }

    public Sucursal(String encargadoNombre, String encargadoapellido) {
        this.encargadoNombre = encargadoNombre;
        this.encargadoapellido = encargadoapellido;
    }

    public void datosSucursal() {
        JOptionPane.showMessageDialog(null, "Datos del Local: "
                + "\nNombre: " + nombre
                + "\nDireccion: " + direccion
                + "\nTeléfono: " + telefono
                + "\nGerente: " + encargadoNombre + encargadoapellido
                + "\nHorario: " + horario);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEncargadoNombre() {
        return encargadoNombre;
    }

    public void setEncargadoNombre(String encargadoNombre) {
        this.encargadoNombre = encargadoNombre;
    }

    public String getEncargadoapellido() {
        return encargadoapellido;
    }

    public void setEncargadoapellido(String encargadoapellido) {
        this.encargadoapellido = encargadoapellido;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

}// fin sucursal

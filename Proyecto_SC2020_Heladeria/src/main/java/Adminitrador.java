
import javax.swing.JOptionPane;

/**
 *
 * @author emily
 */
public class Adminitrador {

    private String usuario = "emily.rp";
    private String contrasena = "1234";
    private RegistroCliente registro;

// Aqui va el menú para ver las otras opciones---------------------------------
    public void menu() {
        Empleado empleado1 = new Empleado();
        Sucursal sucursal1 = new Sucursal();
        Inventario inventario1 = new Inventario();
        RegistroCliente registro1 = new RegistroCliente();
        Cliente cliente1 = new Cliente();
        Ganancia ganancia1 = new Ganancia();

        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Usted se encuntra en el menú Administrador"
                    + "\nDigite la opción que desea consultar"
                    + "\n1. Empleados"
                    + "\n2. Sucursal"
                    + "\n3. Inventario"
                    + "\n4. Clientes"
                    + "\n5. Ganancias"
                    + "\n0. Salir"));

            switch (opcion) {
                case 1:
                    empleado1.datosEmpleado();
                    empleado1.mostrarEmpleado();
                    break;
                case 2:
                    empleado1.datosEmpleado();
                    sucursal1.datosSucursal();
                    break;
                case 3://inventario
                    break;
                case 4:
                    registro.mostrarClientes();

                    break;
                case 5://ganancia
                    empleado1.datosEmpleado();
                    JOptionPane.showInputDialog(
                            "Monto de inicio de mes: ¢." + ganancia1.getMontoActual()
                            + "\n\n• Gastos de la empresa: "
                            + "\nEl gasto en pagos de planilla corresponde a: ¢." + empleado1.totalPlanilla()
                            + "\nPara un monto total de: ¢." + ganancia1.gastosTotal()
                            + "\n\n• Ingresos de la empresa: "
                            + "\nIngresos de vetas: ¢." + null);
                    break;

            }// fin switch
        } while (opcion != 0);//Fin ciclo while  
    }
//------------------------------------------------------------------------------

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRegistro(RegistroCliente registro1) {
        this.registro = registro1;
    }
}

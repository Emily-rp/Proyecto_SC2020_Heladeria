import javax.swing.JOptionPane;
/**
 *
 * @author emily
 */
public class Adminitrador {
private String usuario = "emily.rp";
private String contrasena = "1234";
public int opcion2;

    public Adminitrador(){}

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





    
// Aqui va el menú para ver las otras opciones---------------------------------
 public int menu(){
     
    Empleado empleado1 = new Empleado();
    Sucursal sucursal1 = new Sucursal();
    Inventario inventario1 = new Inventario();
    Cliente cliente1 = new Cliente();
    Ganancia ganancia1 = new Ganancia();
    
         do{
            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Usted se encuntra en el menú Administrador"
                     + "\nDigite la opción que desea consultar"
                     + "\n1. Empleados"
                     + "\n2. Sucursales"
                     + "\n3. Inventario"
                     + "\n4. Clientes"
                     + "\n5. Ganancias"
                     + "\n0. Salir"));
            switch (opcion2){
                case 1://empleado
                case 2://sucursal
                case 3://inventario
                case 4://cliente
                case 5://ganancia
                case 0://salir    
                    
            }// fin switch
        } while(opcion2 == 0);//Fin ciclo while
         
    return opcion2;
    
 }
} 
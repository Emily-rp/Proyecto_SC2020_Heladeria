
import javax.swing.JOptionPane;

/*
Los atributos seran encapsulados y rendremos un maximo de 10 empleados 
los cuales por medio de arreglos seran almacenados
el salario sera el unico dato privado
seran un total de 10 empleados y lo sdatos se llevaran por medio de un arreglo 
/**
 *
 * @author emily
 */
public class Empleado {

    String nombre;
    String apellido;
    String cedula;
    String cargo;
    int edad;
    private int horasSemana;
    private float pagoHora;
    double salarioBruto;
    float suma;

    private Empleado arreglo[] = new Empleado[10];
    Adminitrador admi = new Adminitrador();
    Sucursal encargado = new Sucursal("Jorge","Jiménez");

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, String cargo, int edad, int horasSemana, float pagoHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cargo = cargo;
        this.edad = edad;
        this.horasSemana = horasSemana;
        this.pagoHora = pagoHora;
    }

    public Empleado(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    
    public void datosEmpleado() {
        arreglo[0] = new Empleado(encargado.getEncargadoNombre(),encargado.getEncargadoapellido(),"1 5348 2384","Encargado",31,45,700000);
        arreglo[1] = new Empleado("Max", "Pacheco", "1 9402 4822","Cajero",30,20,300000);
        arreglo[2] = new Empleado("Luciana", "Ricati", "9 3128 3123","Cajero",45,25,380000);
        arreglo[3] = new Empleado("Valeri","García","1 8395 38973", "Cocina",22,45,500000);
        arreglo[4] = new Empleado("Luis", "Soto","3 8403 0982","Cocina",27,45,500000);
        arreglo[5] = new Empleado("Guillermo","Pacheco","3 8924 8732","Encargado de Cocina",39,45,600000);
        arreglo[6] = new Empleado("Esteban", "Sanchez", "2 9873 3234","Mesero",38,40,500000);
        arreglo[7] = new Empleado("Otto","Soto","3 2574 8928","Mesero",30,45,5800000);
        arreglo[8] = new Empleado("Marcela","Cabrera","1 9483 8283","Limpieza",37,45,300000);
        arreglo[9] = new Empleado("Amanda","nuñez","1 9374 2123","servicio de eventos", 24,30,450000);
        
        
    }// fin datosEmpleado

    public void mostrarEmpleado() {

        int salir = 0;
        do {
            String elNombre = JOptionPane.showInputDialog("Su planilla consta de " + (arreglo.length)
                    + " empleados:"
                    + "\n1. " + arreglo[0].nombre + " " + arreglo[0].apellido
                    + "\n2. " + arreglo[1].nombre + " " + arreglo[1].apellido
                    + "\n3. " + arreglo[2].nombre + " " + arreglo[2].apellido
                    + "\n4. " + arreglo[3].nombre + " " + arreglo[3].apellido
                    + "\n5. " + arreglo[4].nombre + " " + arreglo[4].apellido
                    + "\n6. " + arreglo[5].nombre + " " + arreglo[5].apellido
                    + "\n7. " + arreglo[6].nombre + " " + arreglo[6].apellido
                    + "\n8. " + arreglo[7].nombre + " " + arreglo[7].apellido
                    + "\n9. " + arreglo[8].nombre + " " + arreglo[8].apellido
                    + "\n10. " + arreglo[9].nombre + " " + arreglo[9].apellido
                    + "\nDigite 1 para consultar los datos de todos los empleados"
                    + "\nDigite 0 para ir al menú de adminitrador");

            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i].nombre.equals(elNombre)) {
                    salarioBruto = arreglo[i].horasSemana * arreglo[i].pagoHora;
                    JOptionPane.showMessageDialog(null,
                            "Datos del empleado: \n" + arreglo[i].nombre + " " + arreglo[i].apellido
                            + "\nCédula: " + arreglo[i].cedula
                            + "\nCargo: " + arreglo[i].cargo
                            + "\nEdad: " + arreglo[i].edad
                            + "\nSalario: "+ salarioBruto);
                    salir = 1;
                    break;

                } else if (elNombre.equals("1")) { //muestra todos los empleados
                    for (int j = 0; j < arreglo.length; j++) {
                        JOptionPane.showMessageDialog(null,
                                "Datos del empleado " + (j + 1)
                                + "\nNombre: " + arreglo[j].nombre + " "+ arreglo[j].apellido
                                + "\nCédula: " + arreglo[j].cedula
                                + "\nCargo: " + arreglo[j].cargo
                                + "\nEdad: " + arreglo[j].edad
                                + "\nSalario: " + salarioBruto);
                    }
                    break;
                } else if (elNombre.equals("0")) {
                    salir = 0;
                }

            }//ciclo for
        } while (salir != 0);
    }//mostrarEmpleado

    public void totalPlanilla(){
        for(int i = 0; i < arreglo.length; i++)
    }
    //Setter and Getters ----------------------------------------------------
    public int getHorasSemana() {
        return horasSemana;
    }

    public void setHorasSemana(int horasSemana) {
        this.horasSemana = horasSemana;
    }

    public float getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(float pagoHora) {
        this.pagoHora = pagoHora;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

}// fin class Empleado

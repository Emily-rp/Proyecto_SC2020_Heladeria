
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
    private float salarioBruto;
    float suma;

    private Empleado arreglo[] = new Empleado[10];//deberian ser mas empleados
    Adminitrador admi = new Adminitrador();

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, String cargo, int edad, int horasSemana, float pagoHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cargo = cargo;
        this.horasSemana = horasSemana;
        this.pagoHora = pagoHora;
    }

    public void datosEmpleado() {
        arreglo[0] = new Empleado("Jorge","Jiménez","1 5348 2384","Gerente",31,45,700000);
        arreglo[1] = new Empleado("Max", "Pacheco", "1 9402 4822","Cajero",30,20,300000);
        arreglo[2] = new Empleado("Luciana", "Ricati", "9 3128 3123","Cajero",45,25,380000);
        arreglo[3] = new Empleado("Valeri","García","1 8395 38973", "Cocina",22,45,500000);
        arreglo[4] = new Empleado("Luis Diego", "Soto","3 8403 0982","Cocina",27,45,500000);
        arreglo[5] = new Empleado("Guillermo","Pacheco","3 8924 8732","Encargado de Cocina",39,45,600000);
        arreglo[6] = new Empleado("Esteban", "Sanchez", "2 9873 3234",;
        arreglo[7] = new Empleado();
        arreglo[8] = new Empleado();
        arreglo[9] = new Empleado();
    }// fin datosEmpleado

    public void mostrarEmpleado() {
        int salir = 0;
        do {
            String elNombre = JOptionPane.showInputDialog("Su planilla consta de " + (arreglo.length)
                    + " empleados:"
                    + "\n1. " + arreglo[0].nombre
                    + "\n2. " + arreglo[1].nombre
                    + "\n3. " + arreglo[2].nombre
                    + "\n4. " + arreglo[3].nombre
                    + "\n5. " + arreglo[4].nombre
                    + "\n6. " + arreglo[5].nombre
                    + "\n7. " + arreglo[6].nombre
                    + "\n8. " + arreglo[7].nombre
                    + "\n9. " + arreglo[8].nombre
                    + "\n10. " + arreglo[9].nombre
                    + "\n\nDigite el nombre del empleado que desea consultar"
                    + "\nDigite Todos para consultar los datos de todos los empleados"
                    + "\nDigite Salir para ir al menú de adminitrador");

            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i].nombre.equals(elNombre)) {
                    JOptionPane.showMessageDialog(null,
                            "Datos del empleado: \n" + arreglo[i].nombre
                            + "\nCédula: " + arreglo[i].cedula
                            + "\nCargo: " + arreglo[i].cargo
                            + "\nEdad: " + arreglo[i].edad
                            + "\nSalario: ");// aqui debo multilicar el salario por la shoras 
                    salir = 1;
                    break;

                } else if (elNombre.equals("Todos")) {
                    for (int j = 0; j < arreglo.length; j++) {
                        JOptionPane.showMessageDialog(null,
                                "Datos del empleado " + (j + 1)
                                + "\nNombre: " + arreglo[j].nombre
                                + "\nCédula: " + arreglo[j].cedula
                                + "\nCargo: " + arreglo[j].cargo
                                + "\nEdad: " + arreglo[j].edad
                                + "\nSalario: ");// aqui debo multilicar el salario por la shoras 
                    }
                    break;
                } else if (elNombre.equals("Salir")) {
                    salir = 0;
                }

            }//ciclo for
        } while (salir != 0);
    }//mostrarEmpleado

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

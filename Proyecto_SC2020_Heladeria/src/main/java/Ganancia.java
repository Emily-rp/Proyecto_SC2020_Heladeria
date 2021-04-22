/*
 aqui se van a almacenar las ganacias del las dos sucursales
 */

/**
 *
 * @author emily
 */
public class Ganancia {

    private double montoActual;
    Empleado planilla = new Empleado();
    
    public void mostrarPlanilla(){
        planilla.datosEmpleado();
        planilla.totalPlanilla();
    }
    
    
    public Ganancia() {
    }

    public Ganancia(int montoActual) {
        this.montoActual = montoActual;
    }

    public void depositar(double ingreso) {
        montoActual = montoActual + ingreso;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }
}

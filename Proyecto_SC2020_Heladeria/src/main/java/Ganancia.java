/*
 aqui se van a almacenar las ganacias del las dos sucursales
 */

/**
 *
 * @author emily
 */
public class Ganancia {

    private double montoActual = 4000000;

    Empleado empleado1 = new Empleado();

    public Ganancia() {
    }

    public double gastosTotal() {
        empleado1.datosEmpleado();
        montoActual = montoActual - empleado1.totalPlanilla();
        return montoActual;
    }

    public double ingresosTotal() {
        return montoActual;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }

}

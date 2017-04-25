
package ejerciciomodelo;


public abstract class Empleados extends Trabajador {
    protected String nombre;
    protected double salarioMensual;

    public Empleados(String nombre, double salarioMensual, int id) {
        super(id);
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }
    
}

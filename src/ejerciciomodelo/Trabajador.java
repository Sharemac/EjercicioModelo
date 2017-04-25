
package ejerciciomodelo;


public abstract class Trabajador {
    protected int id;

    public Trabajador(int id) {
        this.id = id;
    }
    
 public abstract double calcularSalario();
 public abstract String listarInformacion();
}

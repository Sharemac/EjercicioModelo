
package ejerciciomodelo;

public class Administrador extends Empleados {
    private String labor;

    public Administrador(String labor, String nombre, int id) {
        super(nombre, 100, id);
        this.labor = labor;
    }

    @Override
    public double calcularSalario() {
      return this.salarioMensual;
    }

    @Override
    public String listarInformacion() {
       return "Administrador " + this.id +" "+ this.nombre ;
    }
   
}

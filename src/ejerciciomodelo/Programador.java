
package ejerciciomodelo;


public class Programador extends Empleados {
    private String lenguaje;

    public Programador(String lenguaje, String nombre, double salarioMensual, int id) {
        super(nombre, salarioMensual, id);
        this.lenguaje = lenguaje;
    }

    @Override
    public double calcularSalario() {
     double salarioTotal = this.salarioMensual;
     if(this.lenguaje.equals("java"))
         salarioTotal+= (this.salarioMensual*0.2);
     return salarioTotal;
    }

    @Override
    public String listarInformacion() {
     return "Programador "+ this.id + " " + this.nombre;
    }
    
    
}

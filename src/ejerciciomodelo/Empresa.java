
package ejerciciomodelo;

import java.util.ArrayList;


public class Empresa {
    private ArrayList<Trabajador> trabajadores;
    
    public Empresa() {
    this.trabajadores = new ArrayList<>();
}
    public void agregarTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }
public double calcularSalarioTotal(){
    double salarioTotal = 0;
    for (Trabajador trabajador : trabajadores){
        salarioTotal += trabajador.calcularSalario();
    }
    return salarioTotal;
}
public String listarInformacion(){
    String informacion = "";
    for(Trabajador trabajador : trabajadores ){
        informacion += " " + trabajador.listarInformacion();
    }
    return informacion;
}
}

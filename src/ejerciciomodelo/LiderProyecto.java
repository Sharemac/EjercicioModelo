
package ejerciciomodelo;

import java.util.ArrayList;

public class LiderProyecto extends Programador {
    private ArrayList<Programador> programadores;

    public LiderProyecto(ArrayList<Programador> programadores, String lenguaje, String nombre, double salarioMensual, int id) {
        super(lenguaje, nombre, salarioMensual, id);
        this.programadores = programadores;
    }
    
 public void agregarProgramador (Programador p){
     this.programadores.add(p);
 }   
 
  public double calcularSalario(){
      double salarioTotal = 0;
      salarioTotal += super.calcularSalario()* 
              (super.calcularSalario() * 
              this.programadores.size()*0.1);
              return salarioTotal;
  }
 public String listarInformacion(){
     String informacion = super.listarInformacion();
     informacion += "Programadores a cargo \n";
     for (Programador programador : programadores){
         informacion += programador.listarInformacion();
     }
    return informacion;
  }
}

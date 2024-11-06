
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Gerente extends Ej2_Empleado{
    private double bono;

    public Ej2_Gerente(double bono, double quinsena) {
        super(quinsena);
        this.bono = bono;
    }
    
    @Override public double calcularSalario(){
        return quinsena * 2 + bono;
    }
    
    @Override public void mostrarDetalles(){
        System.out.println("el salario del gerente es: " + calcularSalario());
    }
}

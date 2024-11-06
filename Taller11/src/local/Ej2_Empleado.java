
package local;

/**
 *
 * @author Daniel
 */
public abstract class Ej2_Empleado {
    protected double quinsena;

    public Ej2_Empleado(double quinsena) {
        this.quinsena = quinsena;
    }
    
    
    public abstract double calcularSalario();
    public abstract void mostrarDetalles();
}

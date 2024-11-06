
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Vendedor extends Ej2_Empleado{

    public Ej2_Vendedor(double quinsena) {
        super(quinsena);
    }
    
    @Override public double calcularSalario(){
        return quinsena * 2;
    }
    
    @Override public void mostrarDetalles(){
        System.out.println("el salario del vendedor es: " + calcularSalario());
    }
}

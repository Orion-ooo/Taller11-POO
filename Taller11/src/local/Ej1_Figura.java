
package local;

/**
 *
 * @author Daniel
 */
public abstract class Ej1_Figura {
    public abstract double calcularArea();
    public void mostrarArea(){
        System.out.println("el area de la figura es " + calcularArea());
    }
}

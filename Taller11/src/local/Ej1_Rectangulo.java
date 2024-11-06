
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Rectangulo extends Ej1_Figura{
    private double base;
    private double altura;

    public Ej1_Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override public double calcularArea(){
        return base * altura;
    }
    
    @Override public void mostrarArea(){
        System.out.println("el area del rectangulo es: " + calcularArea());
    }
}

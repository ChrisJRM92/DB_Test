import com.clases.Cuadrado;
import com.clases.Rectangulo;

public class Main {
    public static void main(String[] args) {
        //Perimetro rectangulo
        Rectangulo R = new Rectangulo();
        R.setBase(5);
        R.setAltura(10);
        double perimetro = R.calcularPerimetro();
        System.out.println("----------------------");
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        System.out.println("----------------------");

        //Area cuadrado
        Cuadrado C1 = new Cuadrado();
        Cuadrado C2 = new Cuadrado();
        Cuadrado C3 = new Cuadrado();

        C1.setLado(3);
        double areaC1 = C1.calcularArea();
        double perimetroC1 = C1.calcularPerimetro();
        System.out.println("Area cuadrado 1: "+areaC1);
        System.out.println("Perimetro cuadrado 1: "+perimetroC1);
        System.out.println("----------------------");

        C2.setLado(4);
        double areaC2 = C2.calcularArea();
        double perimetroC2 = C2.calcularPerimetro();
        System.out.println("Area cuadrado 2: "+areaC2);
        System.out.println("Perimetro cuadrado 2: "+perimetroC2);
        System.out.println("----------------------");

        C3.setLado(5);
        double areaC3 = C3.calcularArea();
        double perimetroC3 = C3.calcularPerimetro();
        System.out.println("Area cuadrado 3: "+areaC3);
        System.out.println("Perimetro cuadrado 3: "+perimetroC3);
        System.out.println("----------------------");


    }
}
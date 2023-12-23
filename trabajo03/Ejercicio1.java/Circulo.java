// RONI COMPANOCCA CHECCO
// FP2 - TRABAJO 03
// CUI 20210558
// IMORTAMOS ESTA CLASE PARA PODER REALIZAR, LAS SIGUIENTES OERACIONES MATEMATICAS
import java.lang.Math;
// La palabra clave extends la utilizamos en la declaración de una clase para indicar que la clase que estamos declarando es una subclase
public class Circulo extends Punto {
    double radio;
    // REALIZAMOS EL SIGUIENTE CONSTRUCTOR
    public Circulo(double centroX, double centroY, double radio) {
        super(centroX, centroY);
        this.radio = radio;
    }
    // creamos este metodo que se utiliza para calcular y devolver el área de un círculo.
    public double obtenerArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
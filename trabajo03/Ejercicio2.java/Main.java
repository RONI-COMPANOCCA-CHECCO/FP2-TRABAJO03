// RONI COMPANOCCA CHECCO
// FP2 - TRABAJO 03
// CUI 20210558
public class Main {
    public static void main(String[] args) {
        // Este código se utiliza para crear dos instancias
        Punto punto1 = new Punto(1, 2);
        Punto punto2 = new Punto(4, 6);
        // esta linea invoca un método llamado distancia en el objeto punto1 de la clase Punto. 
        double distanciaEntrePuntos = punto1.distancia(punto2);
        System.out.println("Distancia entre los puntos: " + distanciaEntrePuntos);
        // Esta línea de código crea una nueva instancia de la clase Circulo 
        Circulo circulo = new Circulo(0, 0, 5);
        System.out.println("Área del círculo: " + circulo.obtenerArea());
        // agregamos esta nueva linea de codigo para invocar la clase cilindro
        Cilindro cilindro = new Cilindro(0, 0, 5, 10);
        System.out.println("Superficie del cilindro: " + cilindro.calcularSuperficie());
    }
}

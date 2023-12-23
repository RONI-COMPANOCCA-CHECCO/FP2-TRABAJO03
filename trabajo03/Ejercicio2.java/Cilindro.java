// RONI COMPANOCCA CHECCO
// FP2 - TRABAJO 03
// CUI 20210558
class Cilindro extends Circulo {
    double longitud;
    // REALIZAMOS EL SIGUIENTE CONSTRUCTOR
    public Cilindro(double centroX, double centroY, double radio, double longitud) {
        super(centroX, centroY, radio);
        this.longitud = longitud;
    }
    // Este método calcularSuperficie() en la clase Cilindro sirve para calcular la superficie de un cilindro.
    public double calcularSuperficie() {
        return 2 * Math.PI * this.radio * (this.longitud + this.radio);
    }
}
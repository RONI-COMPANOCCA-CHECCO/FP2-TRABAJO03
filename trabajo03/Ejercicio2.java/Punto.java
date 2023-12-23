// RONI COMPANOCCA CHECCO
// FP2 - TRABAJO 03
// CUI 20210558
// IMORTAMOS ESTA CLASE PARA PODER REALIZAR, LAS SIGUIENTES OERACIONES MATEMATICAS
import java.lang.Math;
public class Punto {
    double x, y;
    // REALIZAMOS EL SIGUIENTE CONSTRUCTOR
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // el método distancia calcula y devuelve la distancia entre el punto actual (this) y otro punto (otroPunto)
    public double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow((this.x - otroPunto.x), 2) + Math.pow((this.y - otroPunto.y), 2));
    }
}

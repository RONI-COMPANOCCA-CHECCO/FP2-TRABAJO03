// RONI COMPANOCCA CHECCO
// FP2 - TRABAJO 03
// CUI 20210558
// creamos esta clase con tres metodos
public class Avion implements Vaereo {
    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión ha aterrizado.");
    }

    public void despegar() {
        System.out.println("El avión está despegando.");
    }
}

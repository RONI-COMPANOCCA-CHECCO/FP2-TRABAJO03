// RONI COMPANOCCA CHECCO
// FP2 - TRABAJO 03
// CUI 20210558
public class Barco implements Vmarino {
    @Override
    public void navegar() {
        System.out.println("El barco está navegando.");
    }

    @Override
    public void detenerse() {
        System.out.println("El barco se ha detenido.");
    }

    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el barco.");
    }
}

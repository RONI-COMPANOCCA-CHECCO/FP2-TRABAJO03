// RONI COMPANOCCA CHECCO
// FP2 - TRABAJO 03
// CUI 20210558
public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco();
        Avion avion = new Avion();
        Hidroavion hidroavion = new Hidroavion();

        // Pruebas individuales
        System.out.println("Barco:");
        System.out.println("------------------------");
        barco.navegar();
        barco.detenerse();
        barco.cargarMercancia();

        System.out.println("\nAvión:");
        System.out.println("------------------------");
        avion.volar();
        avion.aterrizar();
        avion.despegar();

        System.out.println("\nHidroavión:");
        System.out.println("------------------------");
        hidroavion.navegar();
        hidroavion.volar();
        hidroavion.aterrizarEnAgua();
        hidroavion.despegarDelAgua();
    }
}

public class Hidroavion implements Vehiculo {
    @Override
    public void navegar() {
        System.out.println("El hidroavión está navegando.");
    }

    @Override
    public void volar() {
        System.out.println("El hidroavión está volando.");
    }

    @Override
    public void aterrizarEnAgua() {
        System.out.println("El hidroavión está aterrizando en agua.");
    }

    @Override
    public void detenerse() {
        System.out.println("El hidroavión se ha detenido.");
    }

    public void despegarDelAgua() {
        System.out.println("El hidroavión está despegando del agua.");
    }

    public void despegar() {
        System.out.println("El hidroavión está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El hidroavión está aterrizando.");
    }
}



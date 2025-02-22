package jairon.vega.joc3d;

public class EventJoc extends Thread {

    private String nom;
    private Integer segonsEnPantalla;
    private EntornJoc entorn;
        
    @Override
    public void run() {
        aparicions();
    }

    public EventJoc(String nom, Integer segonsEnPantalla, EntornJoc entorn) {
        this.nom = nom;
        this.segonsEnPantalla = segonsEnPantalla;
        this.entorn = entorn;
    }

    private void aparicions() {
        int segonsActuals = 0;
        int x, y, z;

        while (segonsEnPantalla == null || segonsActuals < segonsEnPantalla) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

            x = entorn.getPosicioX();
            y = entorn.getPosicioY();
            z = entorn.getPosicioZ();

            if (segonsEnPantalla != null) {
                segonsActuals++;
            }
            System.out.println("Event: " + nom + " aparició: " + segonsActuals + "  x:" + x + "  y:" + y + "  z:" + z);
        }
    }
}

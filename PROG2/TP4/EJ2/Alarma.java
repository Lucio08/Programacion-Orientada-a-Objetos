package TP4.EJ2;

import java.util.ArrayList;

public class Alarma {
    private ArrayList<Sensor> sensores;
    protected Timbre timbre;

    public Alarma(Timbre timbre) {
        this.timbre = timbre;
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor s) {
        if (s != null)
            sensores.add(s);
    }

    public void comprobar() {
        boolean peligro = false;
        for (Sensor sensor : sensores) {
            if (sensor.isAlguien()) {
                System.out.println("La zona afectada es" + sensor.getZonaAfectada());
            }

        }
        if (peligro) {
            timbre.estaSonando();
        }
    }

}

package TP4.EJ2;

public class Main {
    public static void main(String[] args) {
        Sensor s1 = new Sensor("cocina");
        Sensor s2 = new Sensor("patio");
        Sensor s3 = new Sensor("habitacion 1");
        Sensor s4 = new Sensor("living");

        Timbre t1 = new Timbre();

        Alarma a1 = new Alarma(t1);
        a1.agregarSensor(s1);
        a1.agregarSensor(s2);
        a1.agregarSensor(s3);
        a1.agregarSensor(s4);

        s1.setAlguien(true);
        s3.setAlguien(true);

        a1.comprobar();
    }

}

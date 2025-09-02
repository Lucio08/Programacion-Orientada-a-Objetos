package TP1.E2;

public class main {
    public static void main(String[] args) {
        
        Electrodomestico e1 = new Electrodomestico();
        Electrodomestico e2 = new Electrodomestico("Lavarropas", "plata");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.calcularBalance());
        System.out.println(e2.esAltaGama());
    }
}

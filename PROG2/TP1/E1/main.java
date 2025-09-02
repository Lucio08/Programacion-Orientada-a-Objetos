package TP1.E1;

public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona(4343433);
        Persona p2 = new Persona(2525525, "Lucio", "idolo");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.calcularIMC());
    }
}

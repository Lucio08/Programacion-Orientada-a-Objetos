package TP3.EJ2;

public class Main {
    public static void main(String[] args) {
        // 1️⃣ Crear la fábrica
        Fabrica miFabrica = new Fabrica();

        // 2️⃣ Crear productos
        Mueble silla1 = new Silla(5.0, 100.0, 0, "Roble", "Marrón");
        Mueble mesa1 = new Mesa(20.0, 300.0, 0, "Pino", "Natural");
        Mueble banco1 = new Banco(10.0, 150.0, 0, "Cedro", "Oscuro");

        // 3️⃣ Agregar productos al stock de la fábrica
        miFabrica.agregarMueble(silla1);
        miFabrica.agregarMueble(mesa1);
        miFabrica.agregarMueble(banco1);

        // 4️⃣ Mostrar costo total de fabricación
        System.out.println("Costo total de fabricación: " + miFabrica.costoTotalfabricacion());

        // 5️⃣ Mostrar precio total de venta
        System.out.println("Precio total de venta: " + miFabrica.precioTotalDeVenta());

        // 6️⃣ Opcional: mostrar detalles de cada producto
        for (Mueble p : miFabrica.getStock()) {
            System.out.println(p);
        }
    }
}

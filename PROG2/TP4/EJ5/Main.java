package TP4.EJ5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // 🥚 Producto fresco
        ProductoFresco fresco = new ProductoFresco(
                "Huevos de gallina", // nombre
                101, // lote
                LocalDate.of(2025, 12, 10), // fecha de vencimiento
                "Granja El Sol", // origen
                LocalDate.of(2025, 9, 1) // fecha de envasado
        );

        // 🍗 Producto refrigerado
        ProductoRefrigerado refrigerado = new ProductoRefrigerado(
                "Pollo fresco",
                202,
                LocalDate.of(2025, 11, 30),
                "Granja Don Pedro",
                LocalDate.of(2025, 9, 5),
                555 // código del organismo alimentario
        );

        // ❄️ Producto congelado por aire
        CongeladoPorAire aire = new CongeladoPorAire(
                "Hamburguesas de pollo",
                303,
                LocalDate.of(2026, 1, 20),
                LocalDate.of(2025, 9, 10),
                777,
                "Granja San Jorge",
                -18.0, // temperatura mantenimiento
                78.0, // % nitrógeno
                21.0, // % oxígeno
                0.03, // % dióxido
                0.97 // % vapor agua
        );

        // 💧 Producto congelado por agua
        CongeladoAgua agua = new CongeladoAgua(
                "Arvejas congeladas",
                404,
                LocalDate.of(2026, 2, 1),
                LocalDate.of(2025, 9, 15),
                888,
                "Campo Verde",
                -20.0, // temperatura
                1.5, // litros de agua
                3.0 // gramos de sal
        );

        // 🌬️ Producto congelado por nitrógeno
        CongeladosPorNitrogeno nitrogeno = new CongeladosPorNitrogeno(
                "Granos de maíz",
                505,
                LocalDate.of(2026, 3, 5),
                LocalDate.of(2025, 9, 20),
                999,
                "Agro Sur",
                -25.0,
                "Inmersión directa", // método
                45.0 // segundos de exposición
        );

        // 🧾 Mostrar etiquetas (toString)
        System.out.println("=== PRODUCTOS AVÍCOLAS ===");
        System.out.println("\n🟢 FRESCO:\n" + fresco);
        System.out.println("\n🟡 REFRIGERADO:\n" + refrigerado);
        System.out.println("\n🔵 CONGELADO POR AIRE:\n" + aire);
        System.out.println("\n🔵 CONGELADO POR AGUA:\n" + agua);
        System.out.println("\n🔵 CONGELADO POR NITRÓGENO:\n" + nitrogeno);
    }
}
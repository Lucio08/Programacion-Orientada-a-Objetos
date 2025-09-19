package TP2.EJ3;

public class main {
    public static void main(String[] args) {
        // Crear ciudades
        Ciudad c1 = new Ciudad(120000, 1000, 500, 200, 300, 400, 3000);
        Ciudad c2 = new Ciudad(90000, 800, 200, 100, 150, 250, 2000);
        Ciudad c3 = new Ciudad(150000, 1200, 700, 300, 400, 500, 3500);

        // Crear provincias y agregar ciudades
        Provincia p1 = new Provincia();
        p1.getCiudades().add(c1);
        p1.getCiudades().add(c2);

        Provincia p2 = new Provincia();
        p2.getCiudades().add(c3);

        // Crear país y agregar provincias
        Pais pais = new Pais();
        pais.getProvincias().add(p1);
        pais.getProvincias().add(p2);

        // Mostrar ciudades con déficit y más de 100.000 habitantes
        System.out.println("Ciudades con déficit y más de 100.000 habitantes:");
        for (Provincia provincia : pais.getProvincias()) {
            for (Ciudad ciudad : provincia.getCiudades()) {
                if (ciudad.estaEnDeficit() && ciudad.ciudadConMayorHabitantes()) {
                    System.out.println(ciudad);
                }
            }
        }

        // Mostrar provincias con más de la mitad de las ciudades en déficit
        System.out.println("\nProvincias con más de la mitad de ciudades en déficit:");
        for (Provincia provincia : pais.getProvinciasConDeficit()) {
            System.out.println(provincia);
        }
    }
}

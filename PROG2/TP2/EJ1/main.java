package TP2.EJ1;

public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Serie serie = new Serie("Breaking Code", "Serie de programadores", "Lucio", "Drama");

        // Crear temporadas
        Temporada t1 = new Temporada("Temporada 1");
        Temporada t2 = new Temporada("Temporada 2");

        // Agregar episodios a la temporada 1
        Episodio e1 = new Episodio("Piloto", "El inicio", false, -1);
        Episodio e2 = new Episodio("Compilando sueños", "Segundo capítulo", false, -1);
        Episodio e3 = new Episodio("Bug final", "Gran cierre", false, -1);

        // Probar ingresar calificaciones
        e1.ingresarCalificacion(5); // válido
        e2.ingresarCalificacion(3); // válido
        e3.ingresarCalificacion(-1); // no visto
        e3.ingresarCalificacion(10); // inválido

        // Agregar episodios a la temporada
        t1.getEpisodios().add(e1);
        t1.getEpisodios().add(e2);
        t1.getEpisodios().add(e3);

        // Agregar episodios a la temporada 2
        Episodio e4 = new Episodio("Nuevo comienzo", "Primer cap de T2", true, 4);
        Episodio e5 = new Episodio("Final épico", "Último cap de T2", true, 5);

        t2.getEpisodios().add(e4);
        t2.getEpisodios().add(e5);

        // Agregar temporadas a la serie
        serie.getTemporadas().add(t1);
        serie.getTemporadas().add(t2);

        // --- PROBAR LOS MÉTODOS ---

        // Total episodios vistos de una temporada
        System.out.println("Vistos en T1: " + t1.totalDeEpisodiosVistos());

        // Promedio de calificaciones de una temporada
        System.out.println("Promedio T1: " + t1.obtenerPromedioCalificacionesTemporada());

        // Total episodios vistos de la serie
        System.out.println("Vistos en la serie: " + serie.obtenerEpisodiosVistosDeUnaSerie());

        // Promedio de calificaciones de la serie
        System.out.println("Promedio Serie: " + serie.obtenerPromedioDeValoracionSerie());

        // Ver si se vieron todos los episodios de la serie
        System.out.println("¿Se vieron todos los episodios de la serie? " + serie.vioTodasLaSerie());
    }
}

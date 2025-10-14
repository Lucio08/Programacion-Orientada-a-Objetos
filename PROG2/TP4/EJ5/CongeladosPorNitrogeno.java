package TP4.EJ5;

import java.time.LocalDate;

public class CongeladosPorNitrogeno extends ProductoCongelado {
    private String metodoCongelacion;
    private double exposicionAlnitrogeno;// en segundos

    public CongeladosPorNitrogeno(String nombre, int lote, LocalDate fechaVenc, LocalDate fechaDeEmbase, int codigo,
            String granja, double tempMantenimiento, String metodoCongelacion, double exposicionAlnitrogeno) {
        super(nombre, lote, fechaVenc, fechaDeEmbase, codigo, granja, tempMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.exposicionAlnitrogeno = exposicionAlnitrogeno;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public double getExposicionAlnitrogeno() {
        return exposicionAlnitrogeno;
    }

    public void setExposicionAlnitrogeno(double exposicionAlnitrogeno) {
        this.exposicionAlnitrogeno = exposicionAlnitrogeno;
    }

}

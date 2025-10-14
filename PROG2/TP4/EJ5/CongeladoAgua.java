package TP4.EJ5;

import java.time.LocalDate;

public class CongeladoAgua extends ProductoCongelado {
    private double litro, gramoSal;

    public CongeladoAgua(String nombre, int lote, LocalDate fechaVenc, LocalDate fechaDeEmbase, int codigo,
            String granja,
            double tempMantenimiento, double litro, double gramoSal) {
        super(nombre, lote, fechaVenc, fechaDeEmbase, codigo, granja, tempMantenimiento);
        this.litro = litro;
        this.gramoSal = gramoSal;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Litro de agua " + getLitro() + " y gramos de sal " + getGramoSal();
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public double getGramoSal() {
        return gramoSal;
    }

    public void setGramoSal(double gramoSal) {
        this.gramoSal = gramoSal;
    }

}

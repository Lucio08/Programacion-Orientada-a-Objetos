package TP2.EJ3;

public class Ciudad {
    private int habitantes;
    private double imp1, imp2, imp3, imp4, imp5;
    private double gastos;

    public Ciudad(int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gastos) {
        this.setHabitantes(habitantes);
        this.setImp1(imp1);
        this.setImp2(imp2);
        this.setImp3(imp3);
        this.setImp4(imp4);
        this.setImp5(imp5);
        this.setGastos(gastos);
    }

    public boolean estaEnDeficit() {
        return gastos > imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean ciudadConMayorHabitantes() {
        return getHabitantes() >= 100000;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public double getImp1() {
        return imp1;
    }

    public void setImp1(double imp1) {
        this.imp1 = imp1;
    }

    public double getImp2() {
        return imp2;
    }

    public void setImp2(double imp2) {
        this.imp2 = imp2;
    }

    public double getImp3() {
        return imp3;
    }

    public void setImp3(double imp3) {
        this.imp3 = imp3;
    }

    public double getImp4() {
        return imp4;
    }

    public void setImp4(double imp4) {
        this.imp4 = imp4;
    }

    public double getImp5() {
        return imp5;
    }

    public void setImp5(double imp5) {
        this.imp5 = imp5;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    // Ciudad.java
    @Override
    public String toString() {
        return "Ciudad{" +
                "habitantes=" + habitantes +
                ", impuestos=" + (imp1 + imp2 + imp3 + imp4 + imp5) +
                ", gastos=" + gastos +
                ", enDéficit=" + estaEnDeficit() +
                '}';
    }
}

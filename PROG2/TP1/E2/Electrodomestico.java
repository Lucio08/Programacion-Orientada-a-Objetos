package TP1.E2;

public class Electrodomestico {
    private static final int LIMITE_BAJO_CONSUMO = 45;
    private String nombre, color;
    private double precioBase, consumoEnergetico, peso;    

    public Electrodomestico(){
        setNombre("Lola") ;
        setColor("plata");
        setConsumoEnergetico(10);
        setPrecioBase(100);
        setPeso(2);
    }

    public Electrodomestico(String nombre){
        this();
        setNombre(nombre);
    }
    public Electrodomestico(String nombre,String color){
        this(nombre);
        setColor(color);
    }
    
    public Electrodomestico(String nombre,String color, String consumoEnergito){
        this(nombre, color);
        setConsumoEnergetico(consumoEnergetico);
    }
    public Electrodomestico(String nombre,String color, String consumoEnergito, double precioBase){
        this(nombre, color, consumoEnergito);
        setPrecioBase(precioBase);
    }
    public Electrodomestico(String nombre,String color, String consumoEnergito, double precioBase, double peso){
        this(nombre, color, consumoEnergito, precioBase);
        setPeso(peso);
    }

    public boolean esMenorConsumo(){
        return getConsumoEnergetico() <= LIMITE_BAJO_CONSUMO;
    }
    public double calcularBalance(){
        return getPrecioBase()/getPeso();
    }
      
    public boolean esAltaGama(){
        double balance = calcularBalance();
        return balance > 3;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: " + getNombre() + "\n" +
                "color: " + getColor() + "\n" +
                "consumo  :" + getConsumoEnergetico() + "\n" +
                "peso" + getPeso() + "\n" +
                "precio: " + getPrecioBase() + "\n";
    }

    // - - - - - - - - - - - - - - -- - - - - - -


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}

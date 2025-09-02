package TP1.E1;

import java.time.LocalDate;
import java.time.Period;
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private String sexo;
    private double peso;
    private double altura;

    //cuando no tiene valor por defecto se pasa por parametro
    public Persona(int dni, String nombre, String apellido, int edad, LocalDate fechaNacimiento, String sexo, double peso, double altura){
        this.dni = dni;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setFechaNacimiento(fechaNacimiento);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public Persona(int dni){
        this(dni, "N", "N", 1 ,LocalDate.of(2000,1,1), "Femenino", 1.0, 1.0);
    }

    public Persona(int dni, String nombre, String apellido){
        this(dni, nombre, apellido, 1, LocalDate.of(2001, 1, 1), "femenino", 1.0, 1.0);
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento){
        this(dni, nombre, apellido, 1, fechaNacimiento, "femenino", 1.0, 1.0);
    }

//- - - - - - - - - - - metodos
    public double calcularIMC(){
        double alturaM = this.altura / 100.0;
        return this.peso / (alturaM * alturaM);
    }

    public boolean estaEnForma(){
        return this.calcularIMC()>18.5 && this.calcularIMC()< 25;
    }

    // Comprobar si el día y el mes de nacimiento coinciden con el día y mes actuales
    public boolean estaCumpliendoAnios(){
        LocalDate cumpleHoy = LocalDate.now();
        return fechaNacimiento.getMonthValue() == cumpleHoy.getMonthValue() &&
                               fechaNacimiento.getDayOfMonth() == cumpleHoy.getDayOfMonth();
    }

    public boolean esMayor(){
        return getEdad() >= 18;
    }

    public boolean puedeVotar(){
        return getEdad() >= 16;
    }

    public boolean esCoherente(){
        int edadCalculada = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        return edad == edadCalculada; 
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Dni :" + getDni() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "Peso: " + getPeso() + "\n" +
                "Altura " + getAltura() + "\n";
    }
//- - - - - - - - - - - -  - - - - -  - -  - -
       public int getDni(){
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}

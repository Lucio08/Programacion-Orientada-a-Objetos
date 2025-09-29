package TP3.EJ4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Celular {
    ArrayList<Contacto> contactos;

    public Celular(String string) {
        // TODO Auto-generated constructor stub
    }

    public ArrayList<Contacto> mostrarContactos() {
        return new ArrayList<>(contactos);
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void agregarNuevoContacto(Contacto c) {
        this.contactos.add(c);
    }

    public double promedioEdad() {
        double edadSuma = 0;
        for (Contacto contacto : contactos) {
            edadSuma += Period.between(contacto.getFechaDeNacimiento(), LocalDate.now()).getYears();
            ;
        }
        return edadSuma / contactos.size();
    }

    public ArrayList<Contacto> mostrarRepetidos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarRepetidos'");
    }
}

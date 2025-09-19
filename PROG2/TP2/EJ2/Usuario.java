package TP2.EJ2;

public class Usuario {
    private String telefono;
    private String email;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(String telefono, String email) {
        this.setTelefono(telefono);
        this.setEmail(email);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Telefono: " + getTelefono() + "\n" +
                "Email: " + getEmail() + "\n";
    }
}

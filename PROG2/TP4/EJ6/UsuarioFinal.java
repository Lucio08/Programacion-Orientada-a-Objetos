package TP4.EJ6;

public class UsuarioFinal extends Asociado {
    private String usuario, contraseña;

    public UsuarioFinal(String cargo, String nombre, String apellido, int edad, String usuario, String contraseña) {
        super(cargo, nombre, apellido, edad);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}

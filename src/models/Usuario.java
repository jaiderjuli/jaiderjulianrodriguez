package models;

public abstract class Usuario {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contraseña;
    protected String rol;

    public Usuario(int id, String nombre, String apellido, String correo, String contraseña, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public abstract void iniciarSesion(String correo, String contraseña);

    public void cerrarSesion() {
        System.out.println("Sesión cerrada para: " + this.nombre);
    }

}

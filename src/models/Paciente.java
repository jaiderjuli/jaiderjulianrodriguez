package models;

public class Paciente extends Usuario {

    public Paciente(int id, String nombre, String apellido, String correo, String contraseña) {
        super(id, nombre, apellido, correo, contraseña, "Paciente");
    }

    @Override
    public void iniciarSesion(String correo, String contraseña) {
        System.out.println("Paciente " + this.nombre + " inició sesión.");
    }

    public void verHistorialCitas() {
        System.out.println("Mostrando historial de citas del paciente...");
    }
}

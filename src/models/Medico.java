package models;

public class Medico extends Usuario {

    private String especialidad;

    public Medico(int id, String nombre, String apellido, String correo, String contraseña, String especialidad) {
        super(id, nombre, apellido, correo, contraseña, "Medico");
        this.especialidad = especialidad;
    }

    @Override
    public void iniciarSesion(String correo, String contraseña) {
        System.out.println("Médico " + this.nombre + " inició sesión.");
    }

    public void gestionarCitas() {
        System.out.println("El médico está gestionando las citas.");
    }
}

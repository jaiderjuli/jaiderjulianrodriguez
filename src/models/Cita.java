package models;

import java.time.LocalDateTime;

public class Cita {
    private int id;
    private LocalDateTime fechaHora;
    private String estado;
    private Paciente paciente;
    private Medico medico;
    private TipoCita tipoCita;

    public Cita(int id, LocalDateTime fechaHora, String estado, Paciente paciente, Medico medico, TipoCita tipoCita) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.paciente = paciente;
        this.medico = medico;
        this.tipoCita = tipoCita;
    }

    public void confirmarCita() {
        this.estado = "Confirmada";
    }

    public void cancelarCita() {
        this.estado = "Cancelada";
    }

    public void reprogramarCita(LocalDateTime nuevaFecha) {
        this.fechaHora = nuevaFecha;
    }

}

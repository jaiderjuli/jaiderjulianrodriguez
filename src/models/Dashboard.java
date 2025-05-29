package models;

import java.util.List;

public class Dashboard {
    private Usuario usuario;
    private List<Cita> citas;

    public Dashboard(Usuario usuario, List<Cita> citas) {
        this.usuario = usuario;
        this.citas = citas;
    }

    public void mostrarCitas() {
        System.out.println("Mostrando citas para: " + usuario.nombre);
        for (Cita c : citas) {
            System.out.println("Cita: " + c);
        }
    }

    public void filtrarCitasPorEstado(String estado) {
        System.out.println("Filtrando citas por estado: " + estado);
    }

    public void generarReporteCitas() {
        System.out.println("Generando reporte...");
    }
}

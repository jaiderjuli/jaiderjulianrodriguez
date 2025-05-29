import models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(1, "Carlos", "Ramírez", "carlos@mail.com", "123");
        Medico medico = new Medico(2, "Dra. Ana", "Gómez", "ana@clinica.com", "456", "General");
        TipoCita tipo = new TipoCita(1, "Consulta General", "Evaluación médica básica");

        Cita cita = new Cita(1, LocalDateTime.now(), "Pendiente", paciente, medico, tipo);

        List<Cita> lista = new ArrayList<>();
        lista.add(cita);

        Dashboard dashboard = new Dashboard(paciente, lista);
        dashboard.mostrarCitas();
    }
}

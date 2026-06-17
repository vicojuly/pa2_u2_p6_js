package ec.edu.uce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.domain.model.Expediente;
import ec.edu.uce.domain.model.Paciente;
import ec.edu.uce.application.service.ExpedienteService;
import ec.edu.uce.application.service.PacienteService;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
 
    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }
 
    public static class App implements QuarkusApplication {
        
        @Inject
        PacienteService pacienteService;

        @Inject
        ExpedienteService expedienteService;

        @Override
        public int run(String... args) {

            Paciente paciente = new Paciente();
            paciente.setNombre("Julia Soto");
            paciente.setFechaNacimiento(LocalDate.of(2001, 5, 14));
            paciente.setCedula("0503976441");
            paciente.setSector("Latacunga");
            paciente.setTelefono("0989381398");

            Expediente expediente = new Expediente();
            expediente.setAlergias("Polvo, Agua");
            expediente.setObservaciones("Epinefrina a las 10am");
            expediente.setTipoSangre("O+");
            expediente.setPaciente(paciente);

            this.expedienteService.crearExpediente(expediente);
            
            return 0;
            
       }
    }
}
 
 

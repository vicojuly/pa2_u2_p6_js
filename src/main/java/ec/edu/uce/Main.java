package ec.edu.uce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.domain.model.Paciente;
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
        PacienteService PacienteService;

        @Override
        public int run(String... args) {

            Paciente paciente = new Paciente();
            paciente.setNombre("Julia Soto");
            paciente.setCedula("0503976441");
            paciente.setFechaNacimiento(LocalDate.of(2001, 5, 14 ));
            paciente.setSector("Latacunga");
            paciente.setTelefono("0989381398");
            this.PacienteService.crearPaciente(paciente);
            System.out.println(paciente.toString());

            paciente.setCedula("1705632188");
            PacienteService.actualizarPaciente(paciente);
            
            System.out.println(paciente.toString());
            PacienteService.seleccionarPorId(1);

            System.out.println(paciente.toString() );
            return 0;
            
       }
    }
}
 
 

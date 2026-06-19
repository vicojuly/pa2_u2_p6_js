package ec.edu.uce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Expediente;
import ec.edu.uce.domain.model.Libro;
import ec.edu.uce.domain.model.Paciente;
import ec.edu.uce.application.service.AutorService;
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


        @Override
        public int run(String... args) {

           
            return 0;
            
       }
    }
}
 
 

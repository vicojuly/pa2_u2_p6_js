package ec.edu.uce;

import java.time.LocalDate;

import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.domain.model.Estudiante;
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
        private EstudianteService estudianteService;

        @Override
        public int run(String... args) {
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre("Kevin");
            estudiante.setApellido("Chicaiza");
            estudiante.setGenero("F");
            estudiante.setFechaNacimiento(LocalDate.of(2001, 5, 14));
            System.out.println("Guardando estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
            this.estudianteService.guardar(estudiante);

            System.out.println("Estudiante guardado exitosamente.");

            Estudiante es1 = this.estudianteService.seleccionarPorId(1);
            System.out.println("Estudiante SELECCIONADO: " + es1.getNombre() + " " + es1.getApellido());

            Estudiante es2 = this.estudianteService.seleccionarPorId(2); 
            es2.setNombre("Cristian");
            estudianteService.actualizar(es2);

            this.estudianteService.eliminar(1);
    
            
            return 0;
        }
 
    }
}
 
 

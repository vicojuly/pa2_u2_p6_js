package ec.edu.uce;

import java.time.LocalDate;

import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.application.service.ProfesorService;
import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Profesor;
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

        @Inject
        private ProfesorService profesorService;

        @Override
        public int run(String... args) {

            /* 
            System.out.println("*********SECCIÓN ESTUDIANTE*********");
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
            */

            System.out.println("**********SECCIÓN PROFESOR**********");
            Profesor profesor = new Profesor();
            profesor.setNombre("Maria");
            profesor.setApellido("Mendez");   
            profesor.setGenero("F");
            profesor.setMateria("Matemática");
            System.out.println("Guardando profesor: " + profesor.getNombre() + " " + profesor.getApellido());
            this.profesorService.guardar(profesor);

            System.out.println("Profesor guardado exitosamente.");

            Profesor profe1 = this.profesorService.seleccionarPorId(4);
            System.out.println("Profesor SELECCIONADO: " + profe1.getNombre() + " " + profe1.getApellido());

            Profesor profe2 = this.profesorService.seleccionarPorId(5); 
            profe2.setNombre("Cristian");
            profesorService.actualizar(profe2);
            
            boolean elmin = this.profesorService.eliminar(6);
            System.out.println("Profesor eliminado: " + elmin);
            return 0;
        }
 
    }
}
 
 

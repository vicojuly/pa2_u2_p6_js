package ec.edu.uce;

import java.time.LocalDate;
import java.util.List;

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
        private ProfesorService profesorService;

        @Override
        public int run(String... args) {

            System.out.println("Todos los profesores:");
            List<Profesor> profTodos = this.profesorService.buscarTodos();
            for (Profesor profesor : profTodos) {
                System.out.println(profesor.getNombre() +" "+ profesor.getApellido() + " "+ profesor.getMateria());
            }

            System.out.println("***SELECCIONAR POR MATERIA***");
            System.out.println("Computación: ");
            List<Profesor> porMateria = this.profesorService.consultarPorMateria("Computación");
            for (Profesor profesor : porMateria) {
                System.out.println(profesor.getNombre() +" "+ profesor.getApellido() + " "+ profesor.getMateria());
            }

            System.out.println("Analisis: ");
            List<Profesor> porMateria1 = this.profesorService.consultarPorMateria("Analisis");
            for (Profesor profesor : porMateria1) {
                System.out.println(profesor.getNombre() +" "+ profesor.getApellido() + " "+ profesor.getMateria());
            }

            System.out.println("Profesor con teléfono '0987654321': ");
            Profesor porfTelefono = this.profesorService.consultarPorTelefono("0987654321");
            System.out.println(porfTelefono.getNombre() +" "+ porfTelefono.getApellido());

            System.out.println("Profesor con correo 'crcayambe@uce.edu.ec': ");
            Profesor profCorreo = this.profesorService.consultarPorCorreo("crcayambe@uce.edu.ec");
            System.out.print(profCorreo.getNombre() +" "+ profCorreo.getApellido());
           return 0;
        }
 
    }
}
 
 

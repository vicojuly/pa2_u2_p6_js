package ec.edu.uce;

import java.util.List;

import ec.edu.uce.application.service.ProfesorService;
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

            List<Profesor> profesoresMateria = this.profesorService.consultarPorMateriaNamed("Computación");
            System.out.println("Profesores que imparten Computación:");
            for (Profesor prof : profesoresMateria) {
                System.out.println(prof.getNombre() + " "+ prof.getApellido()+ ", Materia: "+prof.getMateria());
            }

            List<Profesor> profesoresGenero = this.profesorService.consultarPorGenero("F");
            System.out.println("Profesores Femeninos:");
            for (Profesor prof : profesoresGenero) {
                System.out.println(prof.getNombre() + " "+prof.getApellido()+ ", Genero: "+ prof.getGenero());
            }

            List<Profesor> profesoresNombre = this.profesorService.consultarPorNombre("Harry");
            System.out.println("Profesores con nombre 'Harry' :");
            for (Profesor prof : profesoresNombre) {
                System.out.println(prof.getNombre() +" "+ prof.getApellido());
            }

            System.out.println("Total de profesores en la base de datos: " + this.profesorService.contarProfesores());
            return 0;
        
        
        }
 
    }
}
 
 

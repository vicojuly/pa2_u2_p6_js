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
        
        @Inject
        AutorService autorService;


        @Override
        public int run(String... args) {

            Autor autor = new Autor();
            autor.setNombre("Gabriel Garcia M");
            autor.setNacionalidad("Colombia");
        
            Libro libro1 = new Libro();
            libro1.setAutor(autor);
            libro1.setAnioPublicacion(LocalDate.of(2001, 10, 1));
            libro1.setTitulo("Cien años de soledad");

            Libro libro2 = new Libro();
            libro2.setAutor(autor);
            libro2.setAnioPublicacion(LocalDate.of(2000, 1, 1));
            libro2.setTitulo("Cronica de una muerte anunciada");

            List<Libro> libros = new ArrayList<>();
            libros.add(libro1);
            libros.add(libro2);

            autor.setLibros(libros);

            this.autorService.crearAutor(autor);
            return 0;
            
       }
    }
}
 
 

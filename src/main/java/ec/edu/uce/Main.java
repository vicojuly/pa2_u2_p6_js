package ec.edu.uce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.domain.model.Actor;
import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Expediente;
import ec.edu.uce.domain.model.Libro;
import ec.edu.uce.domain.model.Paciente;
import ec.edu.uce.domain.model.Pelicula;
import ec.edu.uce.application.service.ActorService;
import ec.edu.uce.application.service.AutorService;
import ec.edu.uce.application.service.ExpedienteService;
import ec.edu.uce.application.service.PacienteService;
import ec.edu.uce.application.service.PeliculaService;
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
        ActorService as;

        @Inject
        PeliculaService ps;

        @Override
        public int run(String... args) {

            Actor ac1 = new Actor();
            ac1.setNombre("Tom Cruise");
            ac1.setNacionalidad("Estadounidense");
            
            Pelicula p1 = new Pelicula();
            p1.setTitulo("James Bond");
            p1.setFechaPublicacion(LocalDate.of(2005, 5, 1));

            Pelicula p2 = new Pelicula();
            p2.setTitulo("TOP GUN: Maverick");
            p2.setFechaPublicacion(LocalDate.of(2025, 12, 1));

            ac1.setPeliculas(List.of(p1,p2));
            this.as.insertar(ac1);

            Actor ac5 = this.as.seleccionarPorId(1);
            
            for (Pelicula peliculas : ac5.getPeliculas()) {
                System.out.println(peliculas.getTitulo());
            }
            return 0;
            
       }
    }
}
 
 

package ec.edu.uce;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.application.service.CiudadanoService;
import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.domain.model.Ciudadano;
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
        CiudadanoService ciudadanoService;

        @Override
        public int run(String... args) {

            Ciudadano ciudadano = new Ciudadano();
            ciudadano.setNombre("Julia Soto");
            ciudadano.setFechaNacimiento(LocalDateTime.of(2001, 5, 14, 6, 30));
            ciudadanoService.crearCiudadano(ciudadano);

            
            return 0;
            
       }
    }
}
 
 

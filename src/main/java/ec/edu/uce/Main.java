package ec.edu.uce;

import java.time.LocalDateTime;

import ec.edu.uce.application.service.CiudadanoService;
import ec.edu.uce.application.service.EmpleadoService;
import ec.edu.uce.domain.model.Ciudadano;
import ec.edu.uce.domain.model.Empleado;
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

        @Inject
        EmpleadoService empleadoService;

        @Override
        public int run(String... args) {

            Ciudadano ciudadano = new Ciudadano();

            ciudadano.setNombre("Nueva transaccion");
            ciudadano.setFechaNacimiento(LocalDateTime.of(1981, 5, 15, 7, 30));
           
            Empleado empleado = new Empleado();
            empleado.setCiudadano(ciudadano);

            empleado.setSalario(null);
            empleado.setFechaIngreso(LocalDateTime.now());
            
            empleadoService.crearEmpleado(empleado);

            return 0;
            
       }
    }
}
 
 

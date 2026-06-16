package ec.edu.uce.application.service;

import java.time.LocalDateTime;

import ec.edu.uce.domain.model.Ciudadano;
import ec.edu.uce.domain.model.Empleado;
import ec.edu.uce.infraestructure.repository.EmpleadoRepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class EmpleadoService {

    @Inject
    private EmpleadoRepositoryImpl empleadoRepositoryImpl;

    @Inject 
    private CiudadanoService ciudadanoService;

    //todas estas instrucciones son una transacción
    @Transactional
    public void crearEmpleado(Empleado empleado){

        this.empleadoRepositoryImpl.crear(empleado);
    }
}

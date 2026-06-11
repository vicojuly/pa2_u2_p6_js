package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Ciudadano;
import ec.edu.uce.infraestructure.repository.CiudadanoRepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CiudadanoService {

    @Inject
    private CiudadanoRepositoryImpl CiudadanoRepositoryImpl;

    public void crearCiudadano(Ciudadano ciudadano){
        this.CiudadanoRepositoryImpl.crear(ciudadano);
        
    }
}

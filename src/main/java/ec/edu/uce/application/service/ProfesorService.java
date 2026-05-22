package ec.edu.uce.application.service;


import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProfesorService {
    
    @Inject
    private ProfesorRepository profesorRepository;

    public void guardar(Profesor profesor) {
        //agregar lógica para sumar restar o modificar
        this.profesorRepository.crear(profesor);
    }

    public Profesor seleccionarPorId(Integer id) {
        return this.profesorRepository.seleccionarPorId(id);
    }

    public void actualizar(Profesor profesor) {
        this.profesorRepository.actualizar(profesor);
    }

    public boolean eliminar(Integer id) {
    try {
        this.profesorRepository.eliminar(id);
        // Si el código llega aquí sin lanzar errores, asumimos éxito
        return true; 
    } catch (Exception e) { 

        System.out.println("No se pudo eliminar: " + e.getMessage());
        return false; 
    }
}
}

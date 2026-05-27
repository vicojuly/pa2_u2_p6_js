package ec.edu.uce.application.service;

import java.util.List;

import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProfesorService {

    @Inject
    private ProfesorRepository profesorRepository;

    public void guardar(Profesor profesor) {
        // agregar lógica para sumar restar o modificar
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

    public List<Profesor> buscarTodos(){
        return this.profesorRepository.seleccionarTodos();
    }


    public List<Profesor> consultarPorMateria(String materia){
        return this.profesorRepository.seleccionarPorMateria(materia);
    }

    public Profesor consultarPorTelefono(String telefono){
        return this.profesorRepository.seleccionarPorTelefono(telefono);
    }

    public Profesor consultarPorCorreo(String correo){
        return this.profesorRepository.seleccionarPorCorreo(correo);
    }
}

package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Alumno;
import ec.edu.uce.domain.repository.AlumnoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AlumnoService {

    @Inject
    private AlumnoRepository alumnoRepository;

    public void insertarAlum(Alumno alumno){
        this.alumnoRepository.insertar(alumno);
    }

    public Alumno buscarPorId(Integer id){
        return this.alumnoRepository.seleccionarPorId(id);
    }

}

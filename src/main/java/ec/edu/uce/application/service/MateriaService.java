package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Materia;
import ec.edu.uce.domain.repository.MateriaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MateriaService {

    @Inject
    private MateriaRepository materiaRepository;

    public void insertarMate(Materia materia){
        this.materiaRepository.insertar(materia);
    }

    public Materia buscarPorId(Integer id){
        return this.materiaRepository.seleccionarPorMateria(id);
    }
}

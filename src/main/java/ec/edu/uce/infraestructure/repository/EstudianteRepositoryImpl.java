package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

//principal gestor de ORM, gestiona los accesos a la BD (CRUD)
@Inject
private EntityManager em;

    @Override
    public void crear(Estudiante estudiante) {
        //.persist GUARDAR
        this.em.persist(estudiante);    
    }

    @Override
    public Estudiante seleccionarPorId(Integer id) {
        //clase a referenciar y PRIMARY KEY
        return this.em.find(Estudiante.class, id);
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        //CUANDO SE HACE .MERGE EL OBJETO DEBE TENER PRIMARY KEY
        this.em.merge(estudiante);
    }

    @Override
    public void eliminar(Integer id) {
        this.em.remove(this.seleccionarPorId(id));

    }

}

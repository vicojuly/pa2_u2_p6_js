package ec.edu.uce.infraestructure.repository;

import java.util.List;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

    @Override
    public List<Estudiante> seleccionarTodos() {
        TypedQuery<Estudiante> miQuery = this.em.createQuery(
            "SELECT e FROM Estudiante e", Estudiante.class
        );
        return miQuery.getResultList();
    } 

    @Override
    public List<Estudiante> seleccionarPorNombre(String nombre) {
        TypedQuery<Estudiante> miQuery = this.em.createQuery(
            "SELECT e FROM Estudiante e WHERE e.nombre = :nombre1", Estudiante.class
        );
        miQuery.setParameter("nombre1", nombre);
        return miQuery.getResultList();
    }

    @Override
    public Estudiante seleccionarPorCedula(String cedula) {
        TypedQuery<Estudiante> miQuery = this.em.createQuery(
            "SELECT e FROM Estudiante e WHERE e.cedula = :cedula", Estudiante.class);
        miQuery.setParameter("cedula", cedula);
        //para un solo resultado
        //return miQuery.getSingleResult();        
        //para escojer el primer resultado de la lista
        //return miQuery.getResultList().get(0); 
        return miQuery.getResultList().getFirst();
    }
    
    

}
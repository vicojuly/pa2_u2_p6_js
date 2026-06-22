package ec.edu.uce.infraestructure.repository;

import java.lang.annotation.Inherited;

import ec.edu.uce.domain.model.Actor;
import ec.edu.uce.domain.repository.ActorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ActorRepositoryImpl implements ActorRepository {

    @Inject
    private EntityManager em;

    @Override
    public void insertar(Actor actor) {
        this.em.persist(actor);
        
    }

    @Override
    public Actor seleccionarPorId(Integer id) {
        return this.em.find(Actor.class, id);
    }

    
}

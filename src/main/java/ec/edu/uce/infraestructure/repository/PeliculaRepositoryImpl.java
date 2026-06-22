package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Pelicula;
import ec.edu.uce.domain.repository.PeliculaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PeliculaRepositoryImpl  implements PeliculaRepository {

    
    @Inject
    private EntityManager em;

    @Override
    public void insertar(Pelicula pelicula) {
        this.em.persist(pelicula);
        
    }

    @Override
    public Pelicula seleccionarPorId(Integer id) {
        return this.em.find(Pelicula.class, id);
    }



}

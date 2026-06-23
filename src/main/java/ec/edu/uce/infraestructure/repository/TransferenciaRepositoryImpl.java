package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Transferencia;
import ec.edu.uce.domain.repository.TransferenciaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class TransferenciaRepositoryImpl implements TransferenciaRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Transferencia transferencia) {
        this.em.persist(transferencia);
        
    }

    @Override
    public Transferencia seleccionarPorId(Integer id) {
        return this.em.find(Transferencia.class, id);
    }


}

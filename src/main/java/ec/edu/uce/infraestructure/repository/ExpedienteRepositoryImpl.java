package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Expediente;
import ec.edu.uce.domain.repository.ExpedienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ExpedienteRepositoryImpl implements ExpedienteRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Expediente expediente) {
        this.em.persist(expediente);
    }


}

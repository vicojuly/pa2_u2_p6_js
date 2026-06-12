package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Paciente;
import ec.edu.uce.domain.repository.PacienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class PacienteRepositoryImpl implements PacienteRepository{

    @Inject
    private EntityManager em;

    @Override
    public void crear(Paciente paciente) {
        this.em.persist(paciente);

    }

    @Override
    public void actualizar(Paciente paciente) {
        this.em.merge(paciente);
    }

    @Override
    public Paciente seleccionarPorId(Integer id) {
        return this.em.find(Paciente.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        this.em.remove(this.seleccionarPorId(id));
    }
    
}

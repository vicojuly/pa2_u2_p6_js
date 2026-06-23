package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.CuentaBancaria;
import ec.edu.uce.domain.repository.CuentaBancariaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CuentaBancariaRepositoryImpl implements CuentaBancariaRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(CuentaBancaria cuentaBancaria) {
        this.em.persist(cuentaBancaria);
        
    }

    @Override
    public CuentaBancaria seleccionarPorId(Integer id) {
        return this.em.find(CuentaBancaria.class, id);
    }

    

}

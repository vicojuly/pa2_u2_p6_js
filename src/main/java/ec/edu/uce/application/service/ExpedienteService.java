package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Expediente;
import ec.edu.uce.domain.repository.ExpedienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class ExpedienteService {

    @Inject
    private ExpedienteRepository expedienteRepository;

    @Transactional
    public void crearExpediente(Expediente expediente){
        this.expedienteRepository.crear(expediente);
    }
}

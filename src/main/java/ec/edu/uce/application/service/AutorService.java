package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.repository.AutorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AutorService {

    @Inject
    private AutorRepository autorRepository;

    public void crearAutor(Autor autor){
        this.autorRepository.crear(autor);
    }
}

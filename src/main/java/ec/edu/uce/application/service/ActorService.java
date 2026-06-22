package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Actor;
import ec.edu.uce.domain.repository.ActorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ActorService {

    @Inject
    private ActorRepository ActorRepository;

    public void insertar(Actor pelicula){
        this.ActorRepository.insertar(pelicula);
    }
    public Actor seleccionarPorId(Integer id){
        return this.ActorRepository.seleccionarPorId(id);
    }
}

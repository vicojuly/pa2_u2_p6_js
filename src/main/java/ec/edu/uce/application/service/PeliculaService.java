package ec.edu.uce.application.service;


import ec.edu.uce.domain.model.Pelicula;
import ec.edu.uce.domain.repository.PeliculaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PeliculaService {

    @Inject
    private PeliculaRepository peliculaRepository;

    public void insertar(Pelicula pelicula){
        this.peliculaRepository.insertar(pelicula);
    }
    public Pelicula seleccionarPorId(Integer id){
        return this.peliculaRepository.seleccionarPorId(id);
    }
}

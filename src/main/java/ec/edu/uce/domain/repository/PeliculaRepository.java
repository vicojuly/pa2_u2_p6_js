package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Pelicula;

public interface PeliculaRepository {

    public void insertar(Pelicula pelicula);
    public Pelicula seleccionarPorId(Integer id);



}

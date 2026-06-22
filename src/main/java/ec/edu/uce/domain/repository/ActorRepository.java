package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Actor;

public interface ActorRepository {
   
    public void insertar(Actor actor);
    public Actor seleccionarPorId(Integer id);

}

package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Materia;

public interface MateriaRepository {
    public void insertar(Materia materia);

    public Materia seleccionarPorMateria(Integer id);
}

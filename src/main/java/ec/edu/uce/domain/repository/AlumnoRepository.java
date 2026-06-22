package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Alumno;

public interface AlumnoRepository {
    public void insertar(Alumno alumno);

    public Alumno seleccionarPorId(Integer id);

}

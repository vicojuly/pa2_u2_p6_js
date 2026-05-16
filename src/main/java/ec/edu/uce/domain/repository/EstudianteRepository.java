package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Estudiante;

//INTERFAZ PARA ACCESO A BASE DE DATOS
public interface EstudianteRepository {

    public void crear(Estudiante estudiante);
    public Estudiante seleccionarPorId(Integer id);
    public void actualizar(Estudiante estudiante);
    public void eliminar(Integer id);


}

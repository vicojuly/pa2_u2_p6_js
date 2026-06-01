package ec.edu.uce.domain.repository;

import java.util.List;

import ec.edu.uce.domain.model.Profesor;

public interface ProfesorRepository {

    public void crear(Profesor profesor);
    public Profesor seleccionarPorId(Integer id);
    public void actualizar(Profesor profesor);
    public void eliminar(Integer id);
    public List<Profesor> seleccionarTodos();
    public List<Profesor> seleccionarPorNombre(String nombre);
    
    public List<Profesor> seleccionarPorMateria(String materia);
    public Profesor seleccionarPorTelefono(String telefono);
    public Profesor seleccionarPorCorreo(String correo);

    //NAMED
    public List<Profesor> seleccionarPorMateriaNamed(String materia);
    public List<Profesor> seleccionarPorGeneroNamed(String genero);
    public List<Profesor> seleccionarPorNombreNamed(String nombre);
    public Long seleccionarContar();

    //NATIVE
    public List<Profesor> seleccionarTodosNative();
    public Long contarProfesorPorMateria(String materia);
    public Long contarProfesorPorGenero(String genero);
    public Long contarProfesorPorMateriayGenero(String materia, String genero);
}

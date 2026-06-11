package ec.edu.uce.domain.repository;

import java.time.LocalDate;
import java.util.List;

import ec.edu.uce.domain.model.Estudiante;

//INTERFAZ PARA ACCESO A BASE DE DATOS
public interface EstudianteRepository {

    public void crear(Estudiante estudiante);
    public Estudiante seleccionarPorId(Integer id);
    public void actualizar(Estudiante estudiante);
    public void eliminar(Integer id);


    
    public List<Estudiante> seleccionarTodos();
    public List<Estudiante> seleccionarPorNombre(String nombre);
    
    public Estudiante seleccionarPorCedula(String cedula);

    public List<Estudiante> seleccionarPorGenero(String genero);

    public List<Estudiante> seleccionarPorGeneroTyped(String genero);

    public List<Estudiante> seleccionarPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin);

    public Long seleccionarContar();

    //NATIVE QUERY
    public List <Estudiante> seleccionarTodosNative();
    
    //CRITERIA API QUERY
    public List<Estudiante> seleccionarTodosCriteria();
    public List<Estudiante> seleccionarPorNombreCriteria(String nombre);
    public List<Estudiante> seleccionarDinamicoCriteria(String nombre, String apellido);
    //se consulta por nombre y apellido a menos que uno de los sean nulos
    }

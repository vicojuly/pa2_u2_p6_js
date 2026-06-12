package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Paciente;
import ec.edu.uce.infraestructure.repository.PacienteRepositoryImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PacienteService {

    @Inject 
    private PacienteRepositoryImpl pacienteRepositoryImpl;

    public void crearPaciente(Paciente paciente){
        this.pacienteRepositoryImpl.crear(paciente);
    }

    public void actualizarPaciente(Paciente paciente){
        this.pacienteRepositoryImpl.actualizar(paciente);
    }

    public Paciente seleccionarPorId(Integer id){
        return this.pacienteRepositoryImpl.seleccionarPorId(id);
    }

    public void eliminarPaciente(Integer id){
        this.pacienteRepositoryImpl.eliminar(id);
    }
    
}

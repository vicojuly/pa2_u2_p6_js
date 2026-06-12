package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.Paciente;

public interface PacienteRepository {

    public void crear(Paciente paciente);
    public void actualizar(Paciente paciente);
    public Paciente seleccionarPorId(Integer id);
    public void eliminar(Integer id);
    

}

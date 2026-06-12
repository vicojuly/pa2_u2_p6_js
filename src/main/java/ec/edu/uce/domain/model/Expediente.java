package ec.edu.uce.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table
@Entity(name = "expediente")
public class Expediente {

    @Id
    @SequenceGenerator(name = "sec_expediente_generador", sequenceName = "sec_expediente", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_expediente_generador")
    @Column(name = "expe_id")
    private Integer id;

    @Column(name = "pacnte_id")
    private Integer pacienteId;

    @Column(name = "expe_tipo_sangre")
    private String tipoSangre;

    @Column(name = "expe_alergias")
    private String alergias;

    @Column(name = "Observaciones")
    private String observaciones;

    public Expediente(){

    }

    public Expediente(Integer id, Integer pacienteId, String tipoSangre, String alergias, String observaciones) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.observaciones = observaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Integer pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    

}

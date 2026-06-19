    package ec.edu.uce.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table
@Entity(name = "paciente")
public class Paciente {

    @Id
    @SequenceGenerator(name = "sec_paciente_generador", sequenceName = "sec_paciente", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_paciente_generador")
    @Column(name = "pacnte_id")
    private Integer id;

    @Column(name = "pacnte_ nombre")
    private String nombre;

    @Column(name = "pacnte_cedula")
    private String cedula;

    @Column(name = "pacnte_fechaNacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "pacnte_telefono")
    private String telefono;

    @Column(name = "pacnte_sector")
    private String sector;


    public Paciente(){

    }

      public Paciente(Integer id, String nombre, String cedula, LocalDate fechaNacimiento, String telefono,
            String sector) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.sector = sector;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Paciente [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fechaNacimiento="
                + fechaNacimiento + ", telefono=" + telefono + ", sector=" + sector + "]";
    }



}


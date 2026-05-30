package ec.edu.uce.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "estudiante") // se refiere a que esta clase mapea a la tabla estudiante
// para varios NAMEDQUERY
@NamedQueries({
        // PARA NAMED QUERY, nombre del query (alias)(Nombre de la entidad.(cualquier
        // nombre)) y consulta JPQL
        @NamedQuery(name = "Estudiante.buscarPorGenero", query = "SELECT e FROM Estudiante e WHERE e.genero = :genero"),
        @NamedQuery(name = "Estudiante.buscarPorApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido = :apellido"),
        @NamedQuery(name = "Estudiante.buscarPorRangoFecha", query = "SELECT e FROM Estudiante e WHERE e.fechaNacimiento BETWEEN :inicio AND :fin"),
        @NamedQuery(name = "Estudiante.contar", query = "SELECT COUNT(e) FROM Estudiante e")
})
public class Estudiante {
    // indicar a qué columna pertenece cada atributo
    @Id
    @SequenceGenerator(name = "sec_estudiante_generador", sequenceName = "sec_estudiante", allocationSize = 1) 
    // indica que se va a usar una secuencia para generar los valores de id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_estudiante_generador") // indica que el valor
                                                                                                // de id se genera
                                                                                                // automáticamente
    @Column(name = "estu_id")
    private Integer id;

    @Column(name = "estu_cedula")
    private String cedula;

    @Column(name = "estu_nombre")
    private String nombre;

    @Column(name = "estu_apellido")
    private String apellido;

    @Column(name = "estu_genero")
    private String genero;

    @Column(name = "estu_fecha_nacimiento")
    private LocalDate fechaNacimiento;

    public Estudiante() {
    }

    public Estudiante(Integer id, String cedula, String nombre, String apellido, String genero,
            LocalDate fechaNacimiento) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
                + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}

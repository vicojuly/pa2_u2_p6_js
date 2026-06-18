package ec.edu.uce.domain.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "alumno")
@Entity
public class Alumno {

    @Id
    @SequenceGenerator(name = "sec_alumno_generador", sequenceName = "sec_alumno", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_alumno_generador")
    @Column(name = "alumn_id")
    private Integer id;

    @Column(name = "alumn_nombre")
    private String nombre;

    @ManyToMany
    //nombre de la tabla de rompimiento: crear relación one to many-many to one
    //se crea una tabla con foreings key de la relación
    //dos primeras letras de las tablas, id de la tabla a referenciar
    @JoinTable(name = "alumno_materia", joinColumns = @JoinColumn(name = "alma_id_alumno"), inverseJoinColumns = @JoinColumn(name = "alma_id_materia"))
    private List<Materia> materia;

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

    public List<Materia> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia> materia) {
        this.materia = materia;
    }

    

}

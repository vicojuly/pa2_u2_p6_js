package ec.edu.uce.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor") 
public class Profesor {

    @Id
    @SequenceGenerator(name = "sec_profesor_generador", sequenceName = "sec_profesor", allocationSize = 1) //indica que se va a usar una secuencia para generar los valores de id   ;
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_profesor_generador") //indica que el valor de id se genera automáticamente
    @Column(name = "prof_id")
    private Integer id;

    @Column(name = "prof_nombre")
    private String nombre;

    @Column(name = "prof_apellido")
    private String apellido;

    @Column(name = "prof_materia")
    private String materia;

    @Column(name = "prof_genero")
    private String genero;

    @Column(name = "prof_correo")
    private String correo;

    @Column(name = "prof_telefono")
    private String telefono;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String materia, String genero, String correo,
            String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Profesor:\n" +
       "ID: " + id + "\n" +
       "Nombre: " + nombre + "\n" +
       "Apellido: " + apellido + "\n" +
       "Materia: " + materia + "\n" +
       "Género: " + genero + "\n" +
       "Correo Institucional: " + correo+ "\n" +
       "Teléfono: " + telefono;
    }   
}

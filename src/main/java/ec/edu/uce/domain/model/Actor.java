package ec.edu.uce.domain.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Table(name = "actor")
@Entity
public class Actor {

    @Id
    @SequenceGenerator(name = "sec_actor_generador", sequenceName = "sec_actor", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_actor_generador")
    @Column(name = "actor_id")
    private Integer id;

    @Column(name = "actor_nombre")
    private String nombre;
    
    @ManyToMany
    @JoinTable(name = "actor_pelicula", joinColumns = @JoinColumn(name = "aupe_id_actor"), inverseJoinColumns = @JoinColumn(name = "aupe_id_peli"))
    private List<Pelicula> peliculas;

    public Actor(){

    }

    public Actor(Integer id, String nombre, List<Pelicula> peliculas) {
        this.id = id;
        this.nombre = nombre;
        this.peliculas = peliculas;
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

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }




}

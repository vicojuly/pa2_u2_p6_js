package ec.edu.uce.domain.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "pelicula")
@Entity
public class Pelicula {

    @Id
    @SequenceGenerator(name = "sec_pelicula_generador", sequenceName = "sec_pelicula", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_pelicula_generador")
    @Column(name = "peli_id")
    private Integer id;

    @Column(name = "peli_titulo")
    private String titulo;

    @Column(name = "peli_fecha_publicacion")
    private LocalDate fechaPublicacion;

    @ManyToMany(mappedBy = "peliculas", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Actor> actores;

    public Pelicula(){

    }

    public Pelicula(Integer id, String titulo, LocalDate fechaPublicacion, List<Actor> actores) {
        this.id = id;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.actores = actores;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }


    

}

package ec.edu.uce.domain.model;

import java.time.LocalDate;

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

    public Pelicula(){

    }


}

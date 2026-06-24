package ec.edu.uce.domain.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "cuenta_bancaria")
@Entity
public class CuentaBancaria {

    @Id
    @SequenceGenerator(name = "seq_cuenta_bancaria_generador", sequenceName = "seq_cuenta_bancaria", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cuenta_bancaria_generador")
    @Column(name = "cuen_id")
    private Integer id;

    @Column(name = "cuen_num_cuenta")
    private String numCuenta;

    @Column(name = "cuen_nombre_propietario")
    private String nombrePropietario;

    @Column(name = "cuen_monto")
    private BigDecimal monto;

    @OneToMany(mappedBy = "cuentaOrigen")
    private List<Transferencia> transferenciasRealizadas;

    @OneToMany(mappedBy = "cuentaDestino")
    private List<Transferencia> transferenciasRecibidas;

    public CuentaBancaria(){

    }
    
    public CuentaBancaria(Integer id, String numCuenta, String nombrePropietario, BigDecimal monto) {
        this.id = id;
        this.numCuenta = numCuenta;
        this.nombrePropietario = nombrePropietario;
        this.monto = monto;
       
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

  


}

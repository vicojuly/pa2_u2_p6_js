package ec.edu.uce.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "transferencia")
@Entity
public class Transferencia {

    @Id
    @SequenceGenerator(name = "seq_transferencia_generador", sequenceName = "seq_transferencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transferencia_generador")
    @Column(name = "trans_id")
    private Integer id;

    @Column(name = "trans_valor")
    private BigDecimal valor;

    @Column(name = "trans_fecha_hora")
    private LocalDateTime fechaHoraTranferida;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tran_cuenta_origen_id")
    private CuentaBancaria cuentaOrigen;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tran_cuenta_destino_id")
    private CuentaBancaria cuentaDestino;

    public Transferencia(){

    }

    public Transferencia(Integer id, BigDecimal valor, LocalDateTime fechaHoraTranferida, CuentaBancaria cuentaOrigen,
            CuentaBancaria cuentaDestino) {
        this.id = id;
        this.valor = valor;
        this.fechaHoraTranferida = fechaHoraTranferida;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getFechaHoraTranferida() {
        return fechaHoraTranferida;
    }

    public void setFechaHoraTranferida(LocalDateTime fechaHoraTranferida) {
        this.fechaHoraTranferida = fechaHoraTranferida;
    }

    public CuentaBancaria getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaBancaria getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaBancaria cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    

    
}

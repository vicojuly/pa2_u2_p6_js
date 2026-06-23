package ec.edu.uce.application.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.domain.model.CuentaBancaria;
import ec.edu.uce.domain.model.Transferencia;
import ec.edu.uce.domain.repository.TransferenciaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TransferenciaService {

    @Inject
    private TransferenciaRepository tr;

    @Inject
    private CuentaBancariaService cbs;

    public void crear(Transferencia transferencia){
        this.tr.crear(transferencia);
    }

    public Transferencia seleccionarPorId(Integer id){
        return this.tr.seleccionarPorId(id);
    }

    public void realizarTransferencia(Integer idOrigen, Integer idDestino, BigDecimal valor){
        Transferencia transferencia = new Transferencia();
        transferencia.setFechaHoraTranferida(LocalDateTime.now());
        transferencia.setValor(new BigDecimal(25));
        
        BigDecimal c1 = this.cbs.seleccionarPorId(idOrigen).getMonto();
        BigDecimal c2 = this.cbs.seleccionarPorId(idDestino).getMonto();
        if(c1.compareTo(c2) > 0){
           BigDecimal nuevoValorOrigen = c1.subtract(transferencia.getValor());
           BigDecimal nuevoValorDestino = transferencia.getValor().add(c2);
           cOrigen.setMonto(nuevoValorOrigen);q
           cDestino.setMonto(nuevoValorDestino);
        }
        transferencia.setCuentaOrigen(cOrigen);
        transferencia.setCuentaDestino(cDestino);

        this.crear(transferencia);
    }
}


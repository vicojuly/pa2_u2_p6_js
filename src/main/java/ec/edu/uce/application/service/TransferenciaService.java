package ec.edu.uce.application.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.domain.model.CuentaBancaria;
import ec.edu.uce.domain.model.Transferencia;
import ec.edu.uce.domain.repository.TransferenciaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

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

    @Transactional
    public void realizarTransferencia(Integer idOrigen, Integer idDestino, BigDecimal valor) {
    
        CuentaBancaria cuentaOrigen = this.cbs.seleccionarPorId(idOrigen);
        CuentaBancaria cuentaDestino = this.cbs.seleccionarPorId(idDestino);

        if (cuentaOrigen.getMonto().compareTo(valor) >= 0) {
            
            Transferencia transferencia = new Transferencia();
            transferencia.setFechaHoraTranferida(LocalDateTime.now());
            transferencia.setValor(valor); 
            
            BigDecimal nuevoValorOrigen = cuentaOrigen.getMonto().subtract(valor);
            BigDecimal nuevoValorDestino = cuentaDestino.getMonto().add(valor);
            
            cuentaOrigen.setMonto(nuevoValorOrigen);
            cuentaDestino.setMonto(nuevoValorDestino);
            transferencia.setCuentaOrigen(cuentaOrigen);
            transferencia.setCuentaDestino(cuentaDestino);
            this.crear(transferencia);
        }
    }
}


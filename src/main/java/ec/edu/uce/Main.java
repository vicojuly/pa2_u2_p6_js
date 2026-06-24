package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import ec.edu.uce.application.service.CuentaBancariaService;
import ec.edu.uce.application.service.TransferenciaService;
import ec.edu.uce.domain.model.Cliente;
import ec.edu.uce.domain.model.CuentaBancaria;
import ec.edu.uce.domain.model.Transferencia;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
 
    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }
 
    public static class App implements QuarkusApplication {
        
        @Inject
        TransferenciaService transferenciaService;

        @Inject
        CuentaBancariaService cuentaBancariaService;

        @Override
        public int run(String... args) {

            CuentaBancaria cb1 = new CuentaBancaria();
            cb1.setNombrePropietario("Dayer");
            cb1.setNumCuenta("343434343");
            cb1.setMonto(new BigDecimal(100));
            this.cuentaBancariaService.crear(cb1);
        
            CuentaBancaria cb2 = new CuentaBancaria();
            cb2.setNombrePropietario("Josue");
            cb2.setNumCuenta("346237877");
            cb2.setMonto(new BigDecimal(50));
            this.cuentaBancariaService.crear(cb2);

            this.transferenciaService.realizarTransferencia(1, 2, new BigDecimal(50));

            
            return 0;
            
       }
    }
}
 
 

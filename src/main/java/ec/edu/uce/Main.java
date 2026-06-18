package ec.edu.uce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import ec.edu.uce.application.service.ClienteService;
import ec.edu.uce.domain.model.Cliente;
import ec.edu.uce.domain.model.Pedido;
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
        ClienteService clienteService;

        @Override
        public int run(String... args) {

            Cliente c = new Cliente();
            c.setNombre("Julia");
            c.setCedula("0500730049");


            Pedido p = new Pedido();
            p.setTotal(Double.valueOf(10));
            p.setCliente(c);
            p.setFecha(LocalDate.of(2000, 1, 1));

            Pedido p1 = new Pedido();
            p1.setTotal(Double.valueOf(100));
            p1.setCliente(c);
            p1.setFecha(LocalDate.of(2000, 11, 11));
            
            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(p1);
            pedidos.add(p);
            c.setPedidos(pedidos);

            this.clienteService.crearCliente(c);
            return 0;
            
       }
    }
}
 
 

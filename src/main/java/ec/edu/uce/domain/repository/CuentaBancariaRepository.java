package ec.edu.uce.domain.repository;

import ec.edu.uce.domain.model.CuentaBancaria;

public interface CuentaBancariaRepository {


    public void crear(CuentaBancaria cuentaBancaria);
    public CuentaBancaria seleccionarPorId(Integer id);
}

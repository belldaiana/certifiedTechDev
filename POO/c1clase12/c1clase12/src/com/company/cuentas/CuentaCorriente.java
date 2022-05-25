package com.company.cuentas;

import com.company.Cheque;
import com.company.Cliente;


public class CuentaCorriente extends Cuenta {

    private Double montoAutorizado;

    public CuentaCorriente(Cliente titular, Double saldo, Double montoAutorizado) {
        super(titular, saldo);
        this.montoAutorizado = montoAutorizado;
    }



    public void depositar(Cheque cheque) {
        System.out.println("estoy depositando un cheque");
        super.depositar(cheque.getValor());
    }

    @Override
    public Boolean puedeExtraer(Double monto) {
        return getSaldo() + montoAutorizado >= monto;
    }
}

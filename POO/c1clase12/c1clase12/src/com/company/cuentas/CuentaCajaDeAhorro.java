package com.company.cuentas;

import com.company.Cliente;

public class CuentaCajaDeAhorro extends Cuenta {

    private Double tasaDeInteres;

    public CuentaCajaDeAhorro(Cliente titular, Double saldo, Double tasaDeInteres) {
        super(titular, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }
}

package com.company.cuentas;

import com.company.Cliente;

public abstract class Cuenta {

    private Cliente titular;
    private Double saldo;

    public Cuenta(Cliente titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double monto){
        if(monto >  0){
            System.out.println("se deposito " + monto);
            saldo += monto;
            informarSaldo();
        }
    }

    public void extraer(Double monto){
        if(puedeExtraer(monto)){
            System.out.println("logre sacar " + monto);
            saldo -= monto;
            informarSaldo();
        }else{
            System.out.println("no podes retirar ese monto");
        }

    }

    public Boolean puedeExtraer(Double monto){
        return saldo >= monto;
    }

    public void informarSaldo(){
        System.out.println("tu saldo es de " + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }
}

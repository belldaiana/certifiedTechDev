package com.company;

public class Cliente {

    private Integer numeroDeCuenta;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(Integer numeroDeCuenta, String apellido, String dni, String cuit) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
}

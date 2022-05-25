package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Capitan capitan = new Capitan("Daiana","Miñio",1);

        Velero velero = new Velero(capitan,1000.0,500.0,2022,10.0,5);

        System.out.println(velero.calcularValorAlquiler());
    }
}

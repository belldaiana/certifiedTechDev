package com.company;

public class Yate extends Embarcacion implements Comparable{

    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora,Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object object) {

        //tengo que indicarle que el objeto que recibi por parametro es un yate
        //casteo

        Yate otroYate = (Yate) object;

     //   return this.cantidadCamarotes - otroYate.cantidadCamarotes;

        if(this.cantidadCamarotes > otroYate.cantidadCamarotes){
            return 1;
        }
        if(this.cantidadCamarotes < otroYate.cantidadCamarotes){
            return -1;
        }
        return 0;
    }




}

package org.domain;

public class Hotel extends Alojamiento {
    private String nombre;
    private Integer estrellas;
    private Integer precioBase = 10000;

    public Hotel(String nombre, Integer estrellas, Direccion direccion, Integer noches) {
        super(direccion, noches);
        this.nombre = nombre;
        if (estrellas < 1) {
            throw new IllegalArgumentException("Un hotel no puede no tener estellas");
        }
        this.estrellas = estrellas;
    }
   @Override public Integer getPrecioPorNoche () {
        return estrellas * precioBase;
    }

}

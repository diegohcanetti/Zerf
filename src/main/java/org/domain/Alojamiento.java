package org.domain;

abstract public class Alojamiento implements Producto {
    private Direccion direccion;
    private int noches;

    public Alojamiento(Direccion direccion, int noches) {
        this.direccion = direccion;
        this.noches = noches;
    }

    public abstract Integer getPrecioPorNoche();

    public Integer getPrecio() {
        return noches * getPrecioPorNoche();
    }
}

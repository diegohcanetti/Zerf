package org.domain;

import java.time.LocalDate;

public class Viaje implements Producto {
    private LocalDate fechaIda;
    private LocalDate fechaVuelta;
    private Aerolinea aerolinea;
    private Integer precioBase;

    public Integer getPrecio() {
        return this.precioBase;
    }
}

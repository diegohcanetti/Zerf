package org.domain;


import java.util.List;

public class Paquete implements Producto {
    private String nombre;
    private String descripcion;
    private List<Producto> productos;

    public Integer getPrecio() {
        return productos.stream().mapToInt(Producto::getPrecio).sum();
    }
}

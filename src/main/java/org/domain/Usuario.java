package org.domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int presupuesto;
    private String nombre;
    private String apellido;
    private List<Producto> productos;

    public Boolean productoEsContrable(Integer costoDeProducto) {
        return costoDeProducto <= presupuesto;
    }

    public void contratarProducto(Producto producto) {
        Integer costoDeProducto = producto.getPrecio();

        if(!this.productoEsContrable(costoDeProducto)) {
            throw new IllegalArgumentException("No tienes los fondos suficientes para realizar esta compra");
        }

        productos.add(producto);
        presupuesto -= costoDeProducto;
    }

    public Integer getCantidadDeProductosAdquiridos() {
        return productos.size();
    }

    public List<Producto> getProductosQuePuedesContratar(List<Producto> productos) {
        List<Producto> productosContratables = new ArrayList<>();
        for(Producto producto: productos) {
            if(this.productoEsContrable(producto.getPrecio())) {
                productosContratables.add(producto);
            }
        }
        return productosContratables;
    }

    public String getNombreUsuario() {
        return nombre;
    }
}

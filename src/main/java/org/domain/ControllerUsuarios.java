package org.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerUsuarios {
    public List<String> obtenerNombresUsuariosOrdenadosPorCantidadDeProductos(List<Usuario> usuarios) {
        return usuarios.stream()
                .sorted(Comparator.comparingInt(
                        Usuario::getCantidadDeProductosAdquiridos
                ).reversed())
                .map(Usuario::getNombreUsuario)
                .collect(Collectors.toList());
    }
}
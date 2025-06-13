package org.domain;

abstract public class CasaODepartamento extends Alojamiento{
    private Integer ambientes;
    private Integer precioMonoambiente = 15000;
    private Integer precioDosACuatroAmbientes = 30000;
    private Integer precioMasDeCuatroAmbientes = 50000;

public CasaODepartamento(Direccion direccion, int noches, int ambientes) {
    super(direccion, noches);
    if (ambientes < 1) {
        throw new IllegalArgumentException("La cantidad de ambientes debe ser al menos 1");
    }
    this.ambientes = ambientes;
}
    @Override public Integer getPrecioPorNoche() {
        if(ambientes == 1) {
            return precioMonoambiente;
        } else if(ambientes <= 4) {
            return precioDosACuatroAmbientes;
        }
        return precioMasDeCuatroAmbientes;
    }
}

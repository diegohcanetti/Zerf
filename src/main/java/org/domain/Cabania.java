package org.domain;


public class Cabania extends CasaODepartamento{
    private Integer cantidadDeCasas;
    private boolean alquilerEsGrupal;

    public Cabania(Direccion direccion, Integer noches, Integer ambientes,
                   Integer cantidadDeCasas, boolean esGrupal) {
        super(direccion, noches, ambientes);
        if(cantidadDeCasas < 0){
            throw new IllegalArgumentException("Debe haber al menos una casa");
        }
        this.cantidadDeCasas = cantidadDeCasas;
        this.alquilerEsGrupal = esGrupal;
    }

    @Override
    public Integer getPrecioPorNoche() {
        Integer precioPorNoche = super.getPrecioPorNoche();
        Integer precioTotal = precioPorNoche * this.cantidadDeCasas;

        if(alquilerEsGrupal){
            Integer descuento = Math.min(50, cantidadDeCasas * 10);
            precioTotal = precioTotal * (100 - descuento) / 100;
        }
        return precioTotal;
    }
}

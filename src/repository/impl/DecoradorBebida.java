package repository.impl;

import repository.Bebida;

public abstract class DecoradorBebida implements Bebida {
    protected Bebida bebida;

    public DecoradorBebida(Bebida bebida) { // Constructor de la bebida
        this.bebida = bebida;
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion();
    }

    @Override
    public double costo() {
        return bebida.costo();
    }
}

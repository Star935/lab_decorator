package repository.impl;

import repository.Bebida;

public class DecoradorConSirope extends DecoradorBebida{
    public DecoradorConSirope(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + " con sirope";
    }

    @Override
    public double costo() {
        return bebida.costo() + 5.5; // Añade un costo adicional para el sirope
    }
}

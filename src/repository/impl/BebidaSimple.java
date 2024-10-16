package repository.impl;

import repository.Bebida;

public class BebidaSimple implements Bebida {
    @Override
    public String obtenerDescripcion() {
        return "Bebida simple :D";
    }

    @Override
    public double costo() {
        return 1.0;
    }
}

package org.praticandoexceptions.model.interfaces;

import org.praticandoexceptions.exceptions.PlacaInvalidaException;

public interface PlacaInterface {

    public boolean validarPlaca(String placa) throws PlacaInvalidaException;
}

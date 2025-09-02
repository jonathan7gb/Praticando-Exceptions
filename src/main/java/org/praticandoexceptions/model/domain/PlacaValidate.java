package org.praticandoexceptions.model.domain;

import org.praticandoexceptions.exceptions.PlacaInvalidaException;
import org.praticandoexceptions.model.interfaces.PlacaInterface;

public class PlacaValidate implements PlacaInterface {

    @Override
    public boolean validarPlaca(String placa) throws PlacaInvalidaException {
        return false;
    }
}

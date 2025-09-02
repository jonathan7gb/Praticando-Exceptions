package org.praticandoexceptions.model.interfaces;

import org.praticandoexceptions.exceptions.CodigoInvalidoException;

public interface CodigoInterface {

    boolean validate(String codigo) throws CodigoInvalidoException;
}

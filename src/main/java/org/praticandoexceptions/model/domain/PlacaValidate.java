package org.praticandoexceptions.model.domain;

import org.praticandoexceptions.exceptions.PlacaInvalidaException;
import org.praticandoexceptions.model.interfaces.PlacaInterface;

public class PlacaValidate implements PlacaInterface {

    @Override
    public boolean validarPlaca(String placa) throws PlacaInvalidaException {
        if (placa == null || placa.length() != 7) {
            throw new PlacaInvalidaException("Placa inválida: deve conter exatamente 7 caracteres.");
        } else {
            String letras = placa.substring(0, 3);
            String numeros = placa.substring(3, 7);

            if (!letras.chars().allMatch(Character::isLetter)) {
                throw new PlacaInvalidaException("Placa inválida: os três primeiros caracteres devem ser letras.");
            }

            if (!numeros.chars().allMatch(Character::isDigit)) {
                throw new PlacaInvalidaException("Placa inválida: os quatro últimos caracteres devem ser números.");
            }

            return true;
        }
    }
}

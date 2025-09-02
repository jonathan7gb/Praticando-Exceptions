package org.praticandoexceptions.model.domain;

import org.praticandoexceptions.exceptions.MarcaInvalidaException;
import org.praticandoexceptions.model.enums.MarcaVeiculo;

public class MarcaValidate {

    public MarcaVeiculo validarMarca(String marca) throws MarcaInvalidaException{
        if(marca == null || marca.trim().isEmpty()){
            throw new MarcaInvalidaException("Marca não pode ser nula ou vazia");
        }

        try{
            return MarcaVeiculo.valueOf(marca.toUpperCase());
        }catch(IllegalArgumentException e ){
            throw new MarcaInvalidaException("Marca inválida: " + marca);
        }
    }
}

package org.praticandoexceptions.model.domain;

import org.praticandoexceptions.model.enums.TipoVeiculo;

public class TipoValidate {

    public TipoVeiculo validarTipo(String tipo) throws IllegalArgumentException{
        if(tipo == null || tipo.trim().isEmpty()){
            throw new IllegalArgumentException("Tipo não pode ser nulo ou vazio");
        }

        try{
            return TipoVeiculo.valueOf(tipo.toUpperCase());
        }catch(IllegalArgumentException e ){
            throw new IllegalArgumentException("Tipo inválido: " + tipo);
        }
    }
}

package org.praticandoexceptions.model.enums;

public enum TipoVeiculo {

    CARRO("Carro"),
    MOTO("Moto"),
    CAMINHAO("Caminhão"),
    VAN("Van");

    private final String tipo;

    TipoVeiculo(String tipo){
        this.tipo = tipo;
    }
}

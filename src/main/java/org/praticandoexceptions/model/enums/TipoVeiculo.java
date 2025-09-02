package org.praticandoexceptions.model.enums;

public enum TipoVeiculo {

    CARRO("Carro"),
    MOTO("Moto"),
    CAMINHÃO("Caminhão"),
    VAN("Van");

    private String tipo;

    TipoVeiculo(String tipo){
        this.tipo = tipo;
    }

    public String getTipoVeiculo(){
        return this.tipo;
    }

    public void setTipoVeiculo(String tipo){
        this.tipo = tipo;
    }
}

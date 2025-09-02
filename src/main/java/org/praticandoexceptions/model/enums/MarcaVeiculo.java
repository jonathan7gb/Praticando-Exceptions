package org.praticandoexceptions.model.enums;

public enum MarcaVeiculo {

    FORD("Ford"),
    FIAT("Fiat"),
    CHEVROLET("Chevrolet"),
    VOLKSWAGEN("Volkswagen"),
    BYD("BYD"),
    BMW("BMW"),
    MERCEDES("Mercedes"),
    PORSCHE("Porsche"),
    JAGUAR("Jaguar"),
    FERRARI("Ferrari"),
    LAMBORGHINI("Lamborghini"),
    TESLA("Tesla"),
    SCANIA("Scania"),
    VOLVO("Volvo"),
    DAF("DAF"),
    HONDA("Honda"),
    YAMAHA("Yamaha"),
    SUZUKI("Suzuki");

    private final String marca;

    MarcaVeiculo(String marca){
        this.marca = marca;
    }

}

package org.praticandoexceptions.model.enums;

public enum MarcaVeiculo {

    FORD("Ford"),
    FIAT("Fiat"),
    CHEVROLET("Chevrolet"),
    VOLKSWAGEN("Volkswagen"),
    RENAULT("Renault"),
    JEEP("Jeep"),
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

    private String marca;

    MarcaVeiculo(String marca){
        this.marca = marca;
    }

    public String getMarcaVeiculo(){
        return this.marca;
    }

    public void setMarcaVeiculo(String marca){
        this.marca = marca;
    }

    public static MarcaVeiculo fromString(String valor) {
        for (MarcaVeiculo m : MarcaVeiculo.values()) {
            if (m.getMarcaVeiculo().equalsIgnoreCase(valor) || m.name().equalsIgnoreCase(valor)) {
                return m;
            }
        }
        throw new IllegalArgumentException("Marca inválida: " + valor);
    }

}

package org.praticandoexceptions.model;
import org.praticandoexceptions.model.domain.CodigoValidate;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.model.enums.MarcaVeiculo;

public class Carro extends VeiculoAbstract {

    public Carro(){
        super();
        this.tipoVeiculo = TipoVeiculo.CARRO;
    }

    public Carro(CodigoValidate codigoVeiculo, String modeloVeiculo, MarcaVeiculo marcaVeiculo, int anoVeiculo, String placaVeiculo) {
        super(codigoVeiculo, modeloVeiculo, marcaVeiculo, anoVeiculo, placaVeiculo, TipoVeiculo.CARRO);
    }

    @Override
    public String toString() {
        return "[" + codigoVeiculo + "] " + marcaVeiculo + " " + modeloVeiculo + " - " + anoVeiculo + " - " + placaVeiculo;
    }
}

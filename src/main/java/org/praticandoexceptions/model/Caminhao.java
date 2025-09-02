package org.praticandoexceptions.model;
import org.praticandoexceptions.model.domain.CodigoValidate;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.model.enums.MarcaVeiculo;

public class Caminhao extends VeiculoAbstract {

    public Caminhao(){
        super();
        this.tipoVeiculo = TipoVeiculo.CAMINHAO;
    }

    public Caminhao(CodigoValidate codigoVeiculo, String modeloVeiculo, MarcaVeiculo marcaVeiculo, int anoVeiculo, String placaVeiculo) {
        super(codigoVeiculo, modeloVeiculo, marcaVeiculo, anoVeiculo, placaVeiculo, TipoVeiculo.CAMINHAO);
    }

    @Override
    public String toString() {
        return "[" + codigoVeiculo + "] " + marcaVeiculo + " " + modeloVeiculo + " - " + anoVeiculo + " - " + placaVeiculo;
    }
}

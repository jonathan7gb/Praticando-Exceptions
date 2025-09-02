package org.praticandoexceptions.model;
import org.praticandoexceptions.model.domain.CodigoValidate;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.model.enums.MarcaVeiculo;

public class Van extends VeiculoAbstract {

    public Van(){
        super();
        this.tipoVeiculo = TipoVeiculo.VAN;
    }

    public Van(CodigoValidate codigoVeiculo, String modeloVeiculo, MarcaVeiculo marcaVeiculo, int anoVeiculo, String placaVeiculo) {
        super(codigoVeiculo, modeloVeiculo, marcaVeiculo, anoVeiculo, placaVeiculo, TipoVeiculo.VAN);
    }

    @Override
    public String toString() {
        return "[" + codigoVeiculo + "] " + marcaVeiculo + " " + modeloVeiculo + " - " + anoVeiculo + " - " + placaVeiculo;
    }
}

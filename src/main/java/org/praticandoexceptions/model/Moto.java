package org.praticandoexceptions.model;
import org.praticandoexceptions.model.domain.CodigoValidate;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.model.enums.MarcaVeiculo;


public class Moto extends VeiculoAbstract {

    public Moto(){
        super();
        this.tipoVeiculo = TipoVeiculo.MOTO;
    }

    public Moto(CodigoValidate codigoVeiculo, String modeloVeiculo, MarcaVeiculo marcaVeiculo, int anoVeiculo, String placaVeiculo) {
        super(codigoVeiculo, modeloVeiculo, marcaVeiculo, anoVeiculo, placaVeiculo, TipoVeiculo.MOTO);
    }

    @Override
    public String toString() {
        return "[" + codigoVeiculo + "] " + marcaVeiculo + " " + modeloVeiculo + " - " + anoVeiculo + " - " + placaVeiculo;
    }
}

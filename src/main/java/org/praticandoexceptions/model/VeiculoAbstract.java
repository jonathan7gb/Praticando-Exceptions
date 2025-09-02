package org.praticandoexceptions.model;

import org.praticandoexceptions.model.domain.CodigoValidate;
import org.praticandoexceptions.model.enums.MarcaVeiculo;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.model.interfaces.VeiculoInterface;

public abstract class VeiculoAbstract implements VeiculoInterface {

    protected CodigoValidate codigoVeiculo;
    protected String modeloVeiculo;
    protected MarcaVeiculo marcaVeiculo;
    protected int anoVeiculo;
    protected String placaVeiculo;
    protected TipoVeiculo tipoVeiculo;

    public VeiculoAbstract(){
        this.codigoVeiculo = null;
        this.modeloVeiculo = "";
        this.marcaVeiculo = null;
        this.anoVeiculo = 0;
        this.placaVeiculo = "";
        this.tipoVeiculo = null;
    }

    public VeiculoAbstract(CodigoValidate codigoVeiculo, String modeloVeiculo, MarcaVeiculo marcaVeiculo, int anoVeiculo, String placaVeiculo, TipoVeiculo tipoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public CodigoValidate getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(CodigoValidate codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public MarcaVeiculo getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(MarcaVeiculo marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public abstract String toString();
}

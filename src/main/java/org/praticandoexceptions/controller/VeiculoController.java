package org.praticandoexceptions.controller;

import org.praticandoexceptions.dao.VeiculoDAO;
import org.praticandoexceptions.model.Veiculo;
import org.praticandoexceptions.model.enums.MarcaVeiculo;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.view.cadastro.*;

public class VeiculoController {

    private VeiculoDAO veiculoDAO = new VeiculoDAO();

    public void cadastrarVeiculo(){
        InserirCodigo codigoInput = new InserirCodigo();
        InserirModelo modeloInput = new InserirModelo();
        InserirMarca marcaInput = new InserirMarca();
        InserirAno anoInput = new InserirAno();
        InserirPlaca placaInput = new InserirPlaca();
        InserirTipo tipoInput    = new InserirTipo();

        String codigo = codigoInput.inserirCodigo();
        String modelo = modeloInput.inserirModelo();
        MarcaVeiculo marca = marcaInput.inserirMarca();
        int ano = anoInput.inserirAno();
        String placa = placaInput.inserirPlaca();
        TipoVeiculo tipo = tipoInput.inserirTipo();

        Veiculo veiculo = new Veiculo(codigo, modelo, marca, ano, placa, tipo);

        veiculoDAO.cadastrarVeiculo(veiculo);
    }
}

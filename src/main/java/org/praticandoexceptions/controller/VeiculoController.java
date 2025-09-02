package org.praticandoexceptions.controller;

import org.praticandoexceptions.dao.VeiculoDAO;
import org.praticandoexceptions.model.Veiculo;
import org.praticandoexceptions.model.enums.MarcaVeiculo;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.view.cadastro.*;
import org.praticandoexceptions.view.headers.CadastrarVeiculoHeader;
import org.praticandoexceptions.view.headers.EditarVeiculoHeader;

public class VeiculoController {

    private VeiculoDAO veiculoDAO = new VeiculoDAO();
    private CadastrarVeiculoHeader cadastrarVeiculoHeader = new CadastrarVeiculoHeader();
    private EditarVeiculoHeader editarVeiculoHeader = new EditarVeiculoHeader();

    public void cadastrarVeiculo(){
        cadastrarVeiculoHeader.cadastrarVeiculoHeader();

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

    public void editarVeiculo(){

        String placaOuCodigo = "";
        int opcao = 0;
        String valorEditar = "";

        InserirCodigo codigoInput = new InserirCodigo();
        InserirModelo modeloInput = new InserirModelo();
        InserirMarca marcaInput = new InserirMarca();
        InserirAno anoInput = new InserirAno();
        InserirPlaca placaInput = new InserirPlaca();
        InserirTipo tipoInput  = new InserirTipo();




        veiculoDAO.editarVeiculoPelaPlacaOuCodigo(placaOuCodigo, opcao, valorEditar);
    }
}

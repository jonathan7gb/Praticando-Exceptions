package org.praticandoexceptions.controller;

import org.praticandoexceptions.dao.VeiculoDAO;
import org.praticandoexceptions.model.Veiculo;
import org.praticandoexceptions.model.enums.MarcaVeiculo;
import org.praticandoexceptions.model.enums.TipoVeiculo;
import org.praticandoexceptions.view.Errors;
import org.praticandoexceptions.view.InputUsuario;
import org.praticandoexceptions.view.cadastroView.*;
import org.praticandoexceptions.view.headersView.CadastrarVeiculoHeader;
import org.praticandoexceptions.view.headersView.EditarVeiculoHeader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.praticandoexceptions.repository.ConnectDatabase;
import org.praticandoexceptions.view.menusView.MenuEditar;

public class VeiculoController {

    private VeiculoDAO veiculoDAO = new VeiculoDAO();
    private CadastrarVeiculoHeader cadastrarVeiculoHeader = new CadastrarVeiculoHeader();
    private EditarVeiculoHeader editarVeiculoHeader = new EditarVeiculoHeader();

    private Connection getConnection() throws SQLException {
        return ConnectDatabase.connect();
    }

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
        boolean achado = false;

        InserirCodigo codigoInput = new InserirCodigo();
        InserirModelo modeloInput = new InserirModelo();
        InserirMarca marcaInput = new InserirMarca();
        InserirAno anoInput = new InserirAno();
        InserirPlaca placaInput = new InserirPlaca();
        InserirTipo tipoInput  = new InserirTipo();
        InputUsuario inputUsuario = new InputUsuario();
        MenuEditar menuEditar = new MenuEditar();
        Errors errors = new Errors();

        placaOuCodigo = inputUsuario.inputPlacaOuCodigo();
        String comando = "SELECT codigo, placa FROM veiculos WHERE codigo = ? OR placa = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            stmt.setString(1 , placaOuCodigo);
            stmt.setString(2 , placaOuCodigo);
            ResultSet rs =  stmt.executeQuery();
           if(rs.next()){
                achado = true;
           }else{
               errors.veiculoNaoEncontrado();
           }

        }catch(SQLException e){
            System.out.println("Erro ao editar veículo: " + e);
        }

        if(achado == true){
            do{
                opcao = menuEditar.menuEditar(placaOuCodigo);
                switch (opcao){
                    case 1 -> {

                    }

                    case 2 -> {

                    }

                    case 3 -> {

                    }

                    case 4 -> {

                    }

                    case 5 -> {

                    }

                    case 6 -> {

                    }
                    case 0 -> {

                    }
                    default -> {
                        errors.inputInvalido();
                    }
                }
            }while(opcao != 0);

            veiculoDAO.editarVeiculoPelaPlacaOuCodigo(placaOuCodigo, opcao, valorEditar);
        }



    }
}

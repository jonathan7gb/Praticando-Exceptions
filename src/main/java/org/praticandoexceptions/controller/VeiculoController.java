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
import org.praticandoexceptions.view.headersView.ListarVeiculosHeader;
import org.praticandoexceptions.view.menusView.MenuEditar;
import org.praticandoexceptions.view.menusView.MenuListar;

public class VeiculoController {

    private VeiculoDAO veiculoDAO = new VeiculoDAO();
    private CadastrarVeiculoHeader cadastrarVeiculoHeader = new CadastrarVeiculoHeader();
    private EditarVeiculoHeader editarVeiculoHeader = new EditarVeiculoHeader();
    private ListarVeiculosHeader listarVeiculosHeader = new ListarVeiculosHeader();
    private InserirCodigo codigoInput = new InserirCodigo();
    private InserirModelo modeloInput = new InserirModelo();
    private InserirMarca marcaInput = new InserirMarca();
    private InserirAno anoInput = new InserirAno();
    private InserirPlaca placaInput = new InserirPlaca();
    private InserirTipo tipoInput  = new InserirTipo();
    private InputUsuario inputUsuario = new InputUsuario();
    private Errors errors = new Errors();
    private MenuEditar menuEditar = new MenuEditar();
    private MenuListar menuListar = new MenuListar();


    private Connection getConnection() throws SQLException {
        return ConnectDatabase.connect();
    }

    public void cadastrarVeiculo(){
        cadastrarVeiculoHeader.cadastrarVeiculoHeader();

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
        boolean achado = false;
        String comandoEditar = "";
        Object valorEditar = null;

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
                        editarVeiculoHeader.editarCodigoHeader();
                        valorEditar = codigoInput.inserirCodigo();
                        comandoEditar = "UPDATE veiculos SET codigo = ? WHERE placa = ? OR codigo = ?";
                    }
                    case 2 ->{
                        editarVeiculoHeader.editarModeloHeader();
                        valorEditar = modeloInput.inserirModelo();
                        comandoEditar = "UPDATE veiculos SET modelo = ? WHERE placa = ? OR codigo = ?";
                    }
                    case 3 ->{
                        editarVeiculoHeader.editarMarcaHeader();
                        valorEditar = marcaInput.inserirMarca();
                        comandoEditar = "UPDATE veiculos SET marca = ? WHERE placa = ? OR codigo = ?";
                    }
                    case 4 ->{
                        editarVeiculoHeader.editarAnoHeader();
                        valorEditar = anoInput.inserirAno();
                        comandoEditar = "UPDATE veiculos SET anoVeiculo = ? WHERE placa = ? OR codigo = ?";

                    }
                    case 5 ->{
                        editarVeiculoHeader.editarPlacaHeader();
                        valorEditar = placaInput.inserirPlaca();
                        comandoEditar = "UPDATE veiculos SET placa = ? WHERE placa = ? OR codigo = ?";
                    }
                    case 6 -> {
                        editarVeiculoHeader.editarTipoHeader();
                        valorEditar = tipoInput.inserirTipo();
                        comandoEditar = "UPDATE veiculos SET tipoVeiculo = ? WHERE placa = ? OR codigo = ?";
                    }
                    case 0 -> {
                        System.out.println("");
                    }
                    default -> {
                        errors.inputInvalido();
                    }
                }

                if(opcao >= 1 || opcao <= 6){
                    veiculoDAO.editarVeiculoPelaPlacaOuCodigo(placaOuCodigo, comandoEditar, valorEditar);
                }
            }while(opcao != 0);

        }


    }

    //---------------------------------------------------------------------------------------------

    public void listarVeiculos(){
        int opcao = -1;

        do{
            opcao = menuListar.menuListar();

            switch (opcao){
                case 1 -> {
                    listarVeiculosHeader.listarVeiculosTodosHeader();
                }
                case 2 -> {
                    menuListar.menuListarPorTipo();
                }
                case 3 -> {
                    menuListar.menuListarPorMarca();
                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 0 -> {
                    System.out.println("");
                }
                default -> {
                    errors.inputInvalido();
                }
            }
        }while(opcao != 0);
    }

}

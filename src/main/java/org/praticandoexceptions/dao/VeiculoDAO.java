package org.praticandoexceptions.dao;

import org.praticandoexceptions.model.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.praticandoexceptions.repository.ConnectDatabase;

public class VeiculoDAO implements VeiculoInterfaceDAO{

    private Connection getConnection() throws SQLException {
        return ConnectDatabase.connect();
    }

    public void cadastrarVeiculo(Veiculo veiculo){
        String comando = "INSERT INTO veiculos VALUES (?, ?, ?, ?, ?, ?)";


        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            stmt.setString(1, veiculo.getCodigoVeiculo());
            stmt.setString(2, veiculo.getModeloVeiculo());
            stmt.setString(3, veiculo.getMarcaVeiculo().name());
            stmt.setInt(4, veiculo.getAnoVeiculo());
            stmt.setString(5, veiculo.getPlacaVeiculo());
            stmt.setString(6, veiculo.getTipoVeiculo().name());

            stmt.executeUpdate();

            System.out.println("\n|| ==== Veículo Inserido com Sucesso! ==== ||\n");

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir veículo: ", e);
        }
    }

    public void editarVeiculoPelaPlacaOuCodigo(String placaOuCodigo, int opcao, String comando, String valorEditar){
        placaOuCodigo = "";
        valorEditar = "";

        switch (opcao){
            case 1 -> {
                comando = "UPDATE veiculos SET codigo = ? WHERE placa = ? OR codigo = ?";

            }
            case 2 ->{
                comando = "UPDATE veiculos SET modelo = ? WHERE placa = ? OR codigo = ?";

            }
            case 3 ->{
                comando = "UPDATE veiculos SET marca = ? WHERE placa = ? OR codigo = ?";

            }
            case 4 ->{
                comando = "UPDATE veiculos SET anoVeiculo = ? WHERE placa = ? OR codigo = ?";

            }
            case 5 ->{
                comando = "UPDATE veiculos SET placa = ? WHERE placa = ? OR codigo = ?";

            }
            case 6 ->{
                comando = "UPDATE veiculos SET tipoVeiculo = ? WHERE placa = ? OR codigo = ?";

            }
        }
    }
}

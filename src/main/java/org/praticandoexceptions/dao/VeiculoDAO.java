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
            stmt.setObject(3, veiculo.getMarcaVeiculo());
            stmt.setInt(4, veiculo.getAnoVeiculo());
            stmt.setString(5, veiculo.getPlacaVeiculo());
            stmt.setObject(6, veiculo.getTipoVeiculo());

            stmt.executeUpdate();

            System.out.println("Veículo Inserido com Sucesso!");

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir veículo: ", e);
        }
    }
}

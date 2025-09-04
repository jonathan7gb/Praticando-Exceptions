package org.praticandoexceptions.dao;

import org.praticandoexceptions.model.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    //---------------------------------------------------------------------------------------------

    public void editarVeiculoPelaPlacaOuCodigo(String placaOuCodigo, String comando, Object valorEditar){
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            if (valorEditar instanceof Enum<?>) {
                stmt.setString(1, ((Enum<?>) valorEditar).name());
            } else {
                stmt.setObject(1, valorEditar);
            }
            stmt.setString(2, placaOuCodigo);
            stmt.setString(3, placaOuCodigo);

            stmt.executeUpdate();

            System.out.println("\n|| ==== Veículo Editado com Sucesso! ==== ||");

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao editar veículo: ", e);
        }
    }

    //---------------------------------------------------------------------------------------------

    public List<Veiculo> listarVeiculos(){
        List<Veiculo> veiculos_list = new ArrayList<>();

        return veiculos_list;
    }
}

package org.praticandoexceptions.dao;

import org.praticandoexceptions.model.Veiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.praticandoexceptions.model.enums.MarcaVeiculo;
import org.praticandoexceptions.model.enums.TipoVeiculo;
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

    public List<Veiculo> listarTodosVeiculos(){
        List<Veiculo> veiculos_list = new ArrayList<>();

        String comando = "SELECT codigo, modelo, marca, anoVeiculo, placa, tipoVeiculo FROM veiculos";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
                String codigo = rs.getString("codigo");
                String modelo = rs.getString("modelo");
                String marcaStr = rs.getString("marca");
                int ano = rs.getInt("anoVeiculo");
                String placa = rs.getString("placa");
                String tipoStr = rs.getString("tipoVeiculo");

                MarcaVeiculo marca = MarcaVeiculo.fromString(marcaStr);
                TipoVeiculo tipo = TipoVeiculo.fromString(tipoStr);

                Veiculo veiculo = new Veiculo(codigo, modelo, marca, ano, placa, tipo);
                veiculos_list.add(veiculo);
            }

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao listar todos os veículos: ", e);
        }

        return veiculos_list;
    }

    //---------------------------------------------------------------------------------------------

    public List<Veiculo> listarVeiculosTipo(TipoVeiculo tipoVeiculo){
        List<Veiculo> veiculos_list = new ArrayList<>();

        String comando = "SELECT codigo, modelo, marca, anoVeiculo, placa, tipoVeiculo FROM veiculos WHERE tipoVeiculo = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            stmt.setObject(1, tipoVeiculo.name());
            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
                String codigo = rs.getString("codigo");
                String modelo = rs.getString("modelo");
                String marcaStr = rs.getString("marca");
                int ano = rs.getInt("anoVeiculo");
                String placa = rs.getString("placa");
                String tipoStr = rs.getString("tipoVeiculo");

                MarcaVeiculo marca = MarcaVeiculo.fromString(marcaStr);
                TipoVeiculo tipo = TipoVeiculo.fromString(tipoStr);

                Veiculo veiculo = new Veiculo(codigo, modelo, marca, ano, placa, tipo);
                veiculos_list.add(veiculo);
            }

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os veículos: ", e);
        }

        return veiculos_list;
    }

    //---------------------------------------------------------------------------------------------

    public List<Veiculo> listarVeiculosMarca(MarcaVeiculo marcaVeiculo){
        List<Veiculo> veiculos_list = new ArrayList<>();

        String comando = "SELECT codigo, modelo, marca, anoVeiculo, placa, tipoVeiculo FROM veiculos WHERE marca = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            stmt.setObject(1, marcaVeiculo.name());
            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
                String codigo = rs.getString("codigo");
                String modelo = rs.getString("modelo");
                String marcaStr = rs.getString("marca");
                int ano = rs.getInt("anoVeiculo");
                String placa = rs.getString("placa");
                String tipoStr = rs.getString("tipoVeiculo");

                MarcaVeiculo marca = MarcaVeiculo.fromString(marcaStr);
                TipoVeiculo tipo = TipoVeiculo.fromString(tipoStr);

                Veiculo veiculo = new Veiculo(codigo, modelo, marca, ano, placa, tipo);
                veiculos_list.add(veiculo);
            }

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os veículos: ", e);
        }

        return veiculos_list;
    }

    //---------------------------------------------------------------------------------------------

    public List<Veiculo> listarVeiculosBuscaModelo(String modeloV){
        List<Veiculo> veiculos_list = new ArrayList<>();

        String comando = "SELECT codigo, modelo, marca, anoVeiculo, placa, tipoVeiculo FROM veiculos WHERE modelo = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            stmt.setString(1, modeloV);
            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
                String codigo = rs.getString("codigo");
                String modelo = rs.getString("modelo");
                String marcaStr = rs.getString("marca");
                int ano = rs.getInt("anoVeiculo");
                String placa = rs.getString("placa");
                String tipoStr = rs.getString("tipoVeiculo");

                MarcaVeiculo marca = MarcaVeiculo.fromString(marcaStr);
                TipoVeiculo tipo = TipoVeiculo.fromString(tipoStr);

                Veiculo veiculo = new Veiculo(codigo, modelo, marca, ano, placa, tipo);
                veiculos_list.add(veiculo);
            }

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os veículos: ", e);
        }

        return veiculos_list;
    }

    //---------------------------------------------------------------------------------------------

    public List<Veiculo> listarVeiculosBuscaPlaca(String placaV){
        List<Veiculo> veiculos_list = new ArrayList<>();

        String comando = "SELECT codigo, modelo, marca, anoVeiculo, placa, tipoVeiculo FROM veiculos WHERE placa = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            stmt.setString(1, placaV);
            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
                String codigo = rs.getString("codigo");
                String modelo = rs.getString("modelo");
                String marcaStr = rs.getString("marca");
                int ano = rs.getInt("anoVeiculo");
                String placa = rs.getString("placa");
                String tipoStr = rs.getString("tipoVeiculo");

                MarcaVeiculo marca = MarcaVeiculo.fromString(marcaStr);
                TipoVeiculo tipo = TipoVeiculo.fromString(tipoStr);

                Veiculo veiculo = new Veiculo(codigo, modelo, marca, ano, placa, tipo);
                veiculos_list.add(veiculo);
            }

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os veículos: ", e);
        }

        return veiculos_list;
    }


    //---------------------------------------------------------------------------------------------

    public List<Veiculo> listarVeiculosBuscaCodigo(String codigoV){
        List<Veiculo> veiculos_list = new ArrayList<>();

        String comando = "SELECT codigo, modelo, marca, anoVeiculo, placa, tipoVeiculo FROM veiculos WHERE codigo = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(comando)) {

            stmt.setString(1, codigoV);
            ResultSet rs = stmt.executeQuery();


            while(rs.next()){
                String codigo = rs.getString("codigo");
                String modelo = rs.getString("modelo");
                String marcaStr = rs.getString("marca");
                int ano = rs.getInt("anoVeiculo");
                String placa = rs.getString("placa");
                String tipoStr = rs.getString("tipoVeiculo");

                MarcaVeiculo marca = MarcaVeiculo.fromString(marcaStr);
                TipoVeiculo tipo = TipoVeiculo.fromString(tipoStr);

                Veiculo veiculo = new Veiculo(codigo, modelo, marca, ano, placa, tipo);
                veiculos_list.add(veiculo);
            }

        }catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os veículos: ", e);
        }

        return veiculos_list;
    }
}

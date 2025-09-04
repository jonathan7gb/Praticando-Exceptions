package org.praticandoexceptions.dao;
import org.praticandoexceptions.model.Veiculo;

public interface VeiculoInterfaceDAO {

    void cadastrarVeiculo(Veiculo veiculo);
    void editarVeiculoPelaPlacaOuCodigo(String placaOuCodigo, String comando, Object valorEditar);
}

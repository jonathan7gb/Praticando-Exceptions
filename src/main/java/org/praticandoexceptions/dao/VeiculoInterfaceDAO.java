package org.praticandoexceptions.dao;
import org.praticandoexceptions.model.Veiculo;

import java.util.List;

public interface VeiculoInterfaceDAO {

    void cadastrarVeiculo(Veiculo veiculo);
    void editarVeiculoPelaPlacaOuCodigo(String placaOuCodigo, String comando, Object valorEditar);
    List<Veiculo> listarTodosVeiculos();
}

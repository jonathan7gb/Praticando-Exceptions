package org.praticandoexceptions.dao;
import org.praticandoexceptions.model.VeiculoAbstract;

public interface VeiculoInterfaceDAO {

    void cadastrarVeiculo(VeiculoAbstract veiculo);
    void excluirVeiculoPeloCodigo(String codigo);
    void editarVeiculoPeloCodigo(String codigo);
    VeiculoAbstract buscarVeiculoPeloCodigo(String codigo);
}

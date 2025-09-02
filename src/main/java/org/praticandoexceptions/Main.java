package org.praticandoexceptions;

import org.praticandoexceptions.controller.VeiculoController;
import org.praticandoexceptions.dao.VeiculoDAO;

public class Main {
    public static void main(String[] args) {

        VeiculoController veiculoController = new VeiculoController();
        veiculoController.cadastrarVeiculo();

    }
}
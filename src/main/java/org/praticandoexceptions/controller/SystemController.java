package org.praticandoexceptions.controller;

import org.praticandoexceptions.view.SystemLeft;
import org.praticandoexceptions.view.menusView.MenuPrincipal;

public class SystemController {

    private MenuPrincipal menuPrincipal = new MenuPrincipal();
    private VeiculoController veiculoController = new VeiculoController();
    SystemLeft systemLeft = new SystemLeft();

    public void mainController(){
        int opcao = -1;
        do{
            opcao = menuPrincipal.MenuPrincipal();

            switch (opcao){
                case 1 -> {
                    veiculoController.cadastrarVeiculo();
                }
                case 2 -> {
                    veiculoController.editarVeiculo();
                }
                case 0 -> {
                    systemLeft.systemLeft();
                }
            }
        }while(opcao != 0);

    }
}

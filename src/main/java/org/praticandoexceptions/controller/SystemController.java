package org.praticandoexceptions.controller;

import org.praticandoexceptions.view.Errors;
import org.praticandoexceptions.view.SystemLeft;
import org.praticandoexceptions.view.menusView.MenuPrincipal;

public class SystemController {

    private MenuPrincipal menuPrincipal = new MenuPrincipal();
    private VeiculoController veiculoController = new VeiculoController();
    SystemLeft systemLeft = new SystemLeft();
    Errors errors = new Errors();

    public void mainController(){
        int opcao = -1;
        do{
            opcao = menuPrincipal.MenuPrincipal();

            switch (opcao){
                case 1 -> {
                    veiculoController.cadastrarVeiculo();
                }
                case 2 -> {
                    veiculoController.listarVeiculos();
                }
                case 3 -> {
                    veiculoController.editarVeiculo();
                }
                case 0 -> {
                    systemLeft.systemLeft();
                }
                default -> {
                    errors.inputInvalido();
                    System.out.println();
                }
            }
        }while(opcao != 0);

    }
}

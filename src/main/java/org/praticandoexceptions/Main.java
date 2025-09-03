package org.praticandoexceptions;

import org.praticandoexceptions.controller.SystemController;
import org.praticandoexceptions.controller.VeiculoController;
import org.praticandoexceptions.dao.VeiculoDAO;
import org.praticandoexceptions.view.menusView.MenuPrincipal;

public class Main {
    public static void main(String[] args) {

        SystemController systemController = new SystemController();

        systemController.mainController();

    }
}
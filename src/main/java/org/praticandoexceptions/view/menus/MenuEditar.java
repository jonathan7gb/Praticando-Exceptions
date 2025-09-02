package org.praticandoexceptions.view.menus;

import org.praticandoexceptions.view.InputUsuario;
import org.praticandoexceptions.view.headers.EditarVeiculoHeader;

public class MenuEditar {

    EditarVeiculoHeader editarVeiculoHeader = new EditarVeiculoHeader();
    InputUsuario inputUsuario = new InputUsuario();

    public int menuEditar(){
        editarVeiculoHeader.editarVeiculoHeader();
        System.out.println("|| 1 - Editar Código");
        System.out.println("|| 2 - Editar Modelo");
        System.out.println("|| 3 - Editar Marca");
        System.out.println("|| 4 - Editar Ano");
        System.out.println("|| 5 - Editar Placa");
        System.out.println("|| 6 - Editar Tipo");
        System.out.println("|| =================================== ||");

        int opcao = inputUsuario.inputUsuario();
        return opcao;
    }
}

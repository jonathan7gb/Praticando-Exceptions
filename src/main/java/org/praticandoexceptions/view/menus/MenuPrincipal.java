package org.praticandoexceptions.view.menus;

import org.praticandoexceptions.view.InputUsuario;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner scanner = new Scanner(System.in);
    InputUsuario inputUsuario = new InputUsuario();

    public int MenuPrincipal(){

        System.out.println("|| ===== GERENCIADOR DE VEÍCULOS ===== ||");
        System.out.println("|| 1 - Cadastrar Veículo               ||");
        System.out.println("|| 2 - Listar Veículos                 ||");
        //System.out.println("|| 3 - Excluir Veículo               ||");
        //System.out.println("|| 4 - Editar Veículo               ||");
        System.out.println("|| =================================== ||");

        int opcao = inputUsuario.inputUsuario();
        return opcao;
    }
}

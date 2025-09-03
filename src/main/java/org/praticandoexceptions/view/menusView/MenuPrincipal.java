package org.praticandoexceptions.view.menusView;

import org.praticandoexceptions.view.InputUsuario;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner scanner = new Scanner(System.in);
    InputUsuario inputUsuario = new InputUsuario();

    public int MenuPrincipal(){

        System.out.println("|| ===== GERENCIADOR DE VEÍCULOS ===== ||");
        System.out.println("|| 1 - Cadastrar Veículo               ||");
        System.out.println("|| 2 - Editar Veículos                 ||");
        System.out.println("|| 0 - Sair do Sistema                 ||");
        //System.out.println("|| 3 - Listar Veículo               ||");
        //System.out.println("|| 4 - Excluir Veículo               ||");
        System.out.println("|| =================================== ||");

        int opcao = inputUsuario.inputUsuario();
        return opcao;
    }
}

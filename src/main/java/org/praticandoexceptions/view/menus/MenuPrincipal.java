package org.praticandoexceptions.view.menus;

import java.util.Scanner;

public class MenuPrincipal {

    Scanner scanner = new Scanner(System.in);

    public int MenuPrincipal(){
        boolean valido = false;
        int opcao = 0;

        System.out.println("|| ===== GERENCIADOR DE VEÍCULOS ===== ||");
        System.out.println("|| 1 - Cadastrar Veículo               ||");
        System.out.println("|| 2 - Listar Veículos                 ||");
        //System.out.println("|| 3 - Excluir Veículo               ||");
        //System.out.println("|| 4 - Editar Veículo               ||");
        System.out.println("|| =================================== ||");

        do{
            System.out.print("|| ? - Sua escolha: ");
            String opcaoInput = scanner.nextLine();

            try{
                opcao = Integer.parseInt(opcaoInput);
                valido = true;
            }catch (NumberFormatException e){
                System.out.println("Erro! Digite apenas números inteiros!\n");
            }
        }while(!valido);

        return opcao;
    }
}

package org.praticandoexceptions.view;

import java.util.Scanner;

public class InputUsuario {
    Scanner scanner = new Scanner(System.in);

    public int inputUsuario(){
        boolean valido = false;
        int opcao = 0;

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

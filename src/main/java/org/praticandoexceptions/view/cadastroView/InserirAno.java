package org.praticandoexceptions.view.cadastroView;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InserirAno {

    Scanner scanner = new Scanner(System.in);

    public int inserirAno() {
        int ano = 0;
        boolean valido = false;

        do{
            System.out.print("- Ano do veículo: ");
            String anoStr = scanner.nextLine();

            try{
                ano = Integer.parseInt(anoStr);
                if(ano < 1886 || ano > 2026){
                    System.err.println("Ano inválido. Deve estar entre 1886 e 2024.");
                }else{
                    valido = true;
                }
            }catch(NumberFormatException e) {
                System.err.println("Ano inválido. Deve ser um número inteiro.\n");
            }

        }while(!valido);

        return ano;
    }
}

package org.praticandoexceptions.view.cadastro;
import java.util.Scanner;

public class InserirAno {

    Scanner scanner = new Scanner(System.in);

    public int inserirAno() {

        System.out.println("- Ano do veículo: ");
        int ano = scanner.nextInt();

        if (ano < 1886 || ano > 2024) {
            throw new IllegalArgumentException("Ano inválido. Deve estar entre 1886 e 2024.");
        }
        return ano;
    }
}

package org.praticandoexceptions.view.cadastro;

import java.util.Scanner;

public class InserirModelo {

    Scanner scanner = new Scanner(System.in);

    public String inserirModelo() {
        System.out.println("- Modelo do veículo: ");
        String modelo = scanner.nextLine();

            if (modelo == null || modelo.trim().isEmpty()) {
                throw new IllegalArgumentException("Modelo não pode ser vazio.");
            }

        return modelo;
    }
}

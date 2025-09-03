package org.praticandoexceptions.view.cadastroView;
import org.praticandoexceptions.exceptions.PlacaInvalidaException;
import org.praticandoexceptions.model.domain.PlacaValidate;

import java.util.Scanner;

public class InserirPlaca {

    Scanner scanner = new Scanner(System.in);

    public String inserirPlaca() {
        PlacaValidate placaValidate = new PlacaValidate();
        String placa = null;
        boolean placaValida = false;

        do{

            try{
                System.out.print("- Placa do veículo: ");
                placa = scanner.nextLine();

                placaValida = placaValidate.validarPlaca(placa);

            }catch(PlacaInvalidaException e){
                System.err.println(e.getMessage());
                placaValida = false;
            }

        }while(!placaValida);

        return placa;
    }

}


package org.praticandoexceptions.view.cadastro;

import org.praticandoexceptions.exceptions.TipoInvalidoException;
import org.praticandoexceptions.model.domain.TipoValidate;

import java.util.Scanner;

public class InserirTipo {

    Scanner scanner = new Scanner(System.in);

    public String inserirTipo() throws TipoInvalidoException {
        TipoValidate tipoValidate = new TipoValidate();
        boolean tipoValido = false;
        String tipo = "";

        do{

            try{
                System.out.println("- Tipo do Veículo ( Carro | Moto | Caminhão | Van ): ");
                tipo = scanner.nextLine();

                tipoValidate.validarTipo(tipo);

            }catch (TipoInvalidoException e){
                System.err.println(e.getMessage());
                tipoValido = false;
            }

        }while(!tipoValido);

        return tipo;


    }
}

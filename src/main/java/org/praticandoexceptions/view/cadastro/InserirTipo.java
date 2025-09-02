package org.praticandoexceptions.view.cadastro;

import org.praticandoexceptions.exceptions.TipoInvalidoException;
import org.praticandoexceptions.model.domain.TipoValidate;
import org.praticandoexceptions.model.enums.TipoVeiculo;

import java.util.Scanner;

public class InserirTipo {

    Scanner scanner = new Scanner(System.in);

    public TipoVeiculo inserirTipo() throws TipoInvalidoException {
        TipoValidate tipoValidate = new TipoValidate();
        boolean tipoValido = false;
        TipoVeiculo tipoVeiculo = null;


        do{

            try{
                System.out.print("- Tipo do Veículo ( Carro | Moto | Caminhão | Van ): ");
                String tipo = scanner.nextLine();

                tipoVeiculo = tipoValidate.validarTipo(tipo);
                tipoValido = true;


            }catch (TipoInvalidoException e){
                System.err.println(e.getMessage());
            }

        }while(!tipoValido);

        return tipoVeiculo;


    }
}

package org.praticandoexceptions.view.cadastro;

import org.praticandoexceptions.exceptions.MarcaInvalidaException;
import org.praticandoexceptions.model.domain.MarcaValidate;
import org.praticandoexceptions.model.enums.MarcaVeiculo;

import java.util.Scanner;

public class InserirMarca {

    Scanner scanner = new Scanner(System.in);

    public MarcaVeiculo inserirMarca() throws MarcaInvalidaException{
        MarcaValidate marcaValidate = new MarcaValidate();
        MarcaVeiculo marcaVeiculo = null;
        boolean marcaValida = false;

        do{

            try{
                System.out.print("- Marca do Veículo: ");
                String marca = scanner.nextLine();

                marcaVeiculo = marcaValidate.validarMarca(marca);
                marcaValida = true;

            }catch(MarcaInvalidaException e){
                System.err.println(e.getMessage());
            }

        }while(!marcaValida);

        return marcaVeiculo;
    }
}

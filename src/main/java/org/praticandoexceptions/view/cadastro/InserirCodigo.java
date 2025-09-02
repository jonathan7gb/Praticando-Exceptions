package org.praticandoexceptions.view.cadastro;

import org.praticandoexceptions.exceptions.CodigoInvalidoException;
import org.praticandoexceptions.model.domain.CodigoValidate;

import java.util.Scanner;

public class InserirCodigo {

    Scanner scanner = new Scanner(System.in);

    public String inserirCodigo() {
        CodigoValidate codigoValidate = new CodigoValidate();
        boolean codigoValido = false;
        String codigo = "";

        do{

            try{
                System.out.print("- Código do veículo: ");
                codigo = scanner.nextLine();

                codigoValido = codigoValidate.validate(codigo);

            }catch(CodigoInvalidoException e){
                System.err.println(e.getMessage());
                codigoValido = false;
            }

        }while(!codigoValido);

        return codigo;
    }
}

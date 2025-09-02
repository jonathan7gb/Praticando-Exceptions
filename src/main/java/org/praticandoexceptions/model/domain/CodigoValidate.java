package org.praticandoexceptions.model.domain;
import org.praticandoexceptions.exceptions.CodigoInvalidoException;
import org.praticandoexceptions.model.interfaces.CodigoInterface;

public class CodigoValidate implements CodigoInterface {

    @Override
    public boolean validate(String codigo) throws CodigoInvalidoException {
        if (codigo == null || codigo.length() < 5 || codigo.length() > 15) {
            throw new CodigoInvalidoException("Código inválido: deve ter pelo menos 5 caracteres e no máximo 15.");
        } else {
            for (char c : codigo.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    throw new CodigoInvalidoException("Código inválido: deve conter apenas letras e números.");
                }
            }
            return true;
        }
    }
}

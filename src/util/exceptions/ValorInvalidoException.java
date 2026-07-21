package util.exceptions;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException() {
        super("Valor Inválido!");
    }

    public ValorInvalidoException(String message) {
        super(message);
    }
}

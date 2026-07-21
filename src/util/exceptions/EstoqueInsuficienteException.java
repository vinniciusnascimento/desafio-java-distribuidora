package util.exceptions;

public class EstoqueInsuficienteException extends RuntimeException{
    public EstoqueInsuficienteException() {
        super("Estoque Insuficiente!");
    }

    public EstoqueInsuficienteException(String message) {
        super(message);
    }
}

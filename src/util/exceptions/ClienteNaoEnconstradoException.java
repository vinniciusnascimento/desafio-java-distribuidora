package util.exceptions;

public class ClienteNaoEnconstradoException extends RuntimeException{
    public ClienteNaoEnconstradoException() {
        super("Cliente não encontrado!");
    }

    public ClienteNaoEnconstradoException(String message) {
        super(message);
    }
}

package domain.cliente;

public class ClienteAtacado extends Cliente{
    public ClienteAtacado(String nome, String cpfOuCnpj) {
        super(nome, cpfOuCnpj);
    }

    @Override
    protected void calcularDesconto(double valorTotal) {
        //
    }
}

package domain.cliente;

public class ClienteVarejo extends Cliente{
    public ClienteVarejo(String nome, String cpfOuCnpj) {
        super(nome, cpfOuCnpj);
    }

    @Override
    protected void calcularDesconto(double valorTotal) {
        //
    }
}

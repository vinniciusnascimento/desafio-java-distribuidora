package domain.cliente;

public class ClienteAtacado extends Cliente{
    public ClienteAtacado(String nome, String cpfOuCnpj) {
        super(nome, cpfOuCnpj);
    }

    @Override
    protected double calcularDesconto(double valorTotal) {
        if (valorTotal > 100){
            return valorTotal * 0.1;
        }
        return valorTotal;
    }
}

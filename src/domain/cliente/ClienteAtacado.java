package domain.cliente;

import domain.interfaces.TemDesconto;

public class ClienteAtacado extends Cliente implements TemDesconto {
    public ClienteAtacado(String nome, String cpfOuCnpj, TipoCliente tipoCliente) {
        super(nome, cpfOuCnpj, tipoCliente);
    }

    @Override
    public double calcularDesconto(double valorTotal) {
        if (valorTotal > 100){
            return valorTotal * 0.1;
        }
        return valorTotal;
    }
}

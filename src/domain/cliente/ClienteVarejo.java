package domain.cliente;

import domain.interfaces.TemDesconto;

public class ClienteVarejo extends Cliente implements TemDesconto {
    public ClienteVarejo(String nome, String cpfOuCnpj, TipoCliente tipoCliente) {
        super(nome, cpfOuCnpj, tipoCliente);
        ClientesList.clientes.add(this);
    }

    @Override
    public double calcularDesconto(double valorTotal) {
        return valorTotal;
    }
}

package domain.cliente;

public class ClienteVarejo extends Cliente{
    public ClienteVarejo(String nome, String cpfOuCnpj, TipoCliente tipoCliente) {
        super(nome, cpfOuCnpj, tipoCliente);
        ClientesList.clientes.add(this);
    }
}

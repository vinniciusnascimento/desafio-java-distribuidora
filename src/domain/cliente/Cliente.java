package domain.cliente;

public abstract class Cliente {
    protected String nome;
    protected String cpfOuCnpj;
    protected TipoCliente tipoCliente;

    public Cliente(String nome, String cpfOuCnpj, TipoCliente tipoCliente) {
        this.nome = nome;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
}

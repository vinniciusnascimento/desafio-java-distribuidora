package domain.cliente;

import util.exceptions.ValorInvalidoException;

public abstract class Cliente {
    protected String nome;
    protected String cpfOuCnpj;
    protected TipoCliente tipoCliente;

    public Cliente(String nome, String cpfOuCnpj, TipoCliente tipoCliente) {
        if (nome == null || nome.isBlank() || cpfOuCnpj == null || cpfOuCnpj.isBlank() || tipoCliente == null ){
            throw new ValorInvalidoException("Informe todos os valores!");
        } else{
            this.nome = nome;
            this.cpfOuCnpj = cpfOuCnpj;
            this.tipoCliente = tipoCliente;
        }
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

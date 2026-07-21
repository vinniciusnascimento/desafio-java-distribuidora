package domain.cliente;

import domain.interfaces.TemDesconto;
import util.exceptions.ValorInvalidoException;

public abstract class Cliente implements TemDesconto {
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

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpfOuCnpj='" + cpfOuCnpj + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
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

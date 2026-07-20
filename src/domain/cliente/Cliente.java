package domain.cliente;

public abstract class Cliente {
    protected String nome;
    protected String cpfOuCnpj;

    public Cliente(String nome, String cpfOuCnpj) {
        this.nome = nome;
        this.cpfOuCnpj = cpfOuCnpj;
    }

    protected abstract void calcularDesconto(double valorTotal);
}

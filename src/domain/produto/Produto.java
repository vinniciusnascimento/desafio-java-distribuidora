package domain.produto;

import util.exceptions.ValorInvalidoException;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        if (nome == null || preco == 0 || quantidadeEmEstoque < 0){
            throw new ValorInvalidoException("Nome, preço ou quantidade em estoque inválido");
        } else{
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
            ProdutoList.produtos.add(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}

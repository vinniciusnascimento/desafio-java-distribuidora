package util;

import domain.item.ItemPedido;
import domain.pedido.Pedido;
import domain.pedido.PedidosList;
import domain.produto.Produto;

public class Comandos {
    public static void listarPedidos(){
        for (Pedido pedido : PedidosList.pedidos) {
            System.out.println("-------------");
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Data: " + pedido.getDataHora());
            System.out.println("Itens: [" );
            for (ItemPedido item : pedido.itens) {
                System.out.println(item.getProduto() + " - " + item.getQuantidade() + "x");
            }
        }
    }

    public static void criarProduto(String nome, double preco, int quantidadeEmEstoque){
        Produto produto = new Produto(nome, preco, quantidadeEmEstoque);
    }
}

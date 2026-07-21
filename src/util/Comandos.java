package util;

import domain.cliente.*;
import domain.item.ItemPedido;
import domain.pedido.Pedido;
import domain.pedido.PedidosList;
import domain.produto.Produto;
import domain.produto.ProdutoList;
import util.exceptions.ClienteNaoEnconstradoException;
import util.exceptions.EstoqueInsuficienteException;
import util.exceptions.ValorInvalidoException;

public class Comandos {
    public static void listarPedidos(){
        for (Pedido pedido : PedidosList.pedidos) {
            System.out.println("-------------");
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Data: " + pedido.getDataHora());
            System.out.println("Itens: " + pedido.getItem());
        }
    }

    public static void listarProdutos(){
        for (Produto produto : ProdutoList.produtos) {
            System.out.println("-------------");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço Unitário: " + produto.getPreco());
            System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
        }
    }

    public static void listarClientes(){
        for (Cliente cliente : ClientesList.clientes) {
            System.out.println("-------------");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Cpf/Cnpj: " + cliente.getCpfOuCnpj());
            System.out.println("Tipo cliente: " + cliente.getTipoCliente().getTipoFormatado());
        }
    }

    public static void criarProduto(String nome, double preco, int quantidadeEmEstoque){
        try{
            Produto produto = new Produto(nome, preco, quantidadeEmEstoque);
        } catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    public static void criarClienteAtacado(String nome, String cpfOuCnpj, TipoCliente tipoCliente){
        try{
            Cliente cliente = new ClienteAtacado(nome, cpfOuCnpj, tipoCliente);
        } catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    public static void criarClienteVarejo(String nome, String cpfOuCnpj, TipoCliente tipoCliente){
        try{
            Cliente cliente = new ClienteVarejo(nome, cpfOuCnpj, tipoCliente);
        } catch (ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    public static void criarPedido(Cliente cliente, ItemPedido item){
        try{
        Pedido pedido = new Pedido(cliente, item);
        } catch (ValorInvalidoException | ClienteNaoEnconstradoException | EstoqueInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    public static ItemPedido criarItemPedido(Produto produto, int quantidade){
        ItemPedido itemPedido = new ItemPedido(produto, quantidade);
        return itemPedido;
    }
}

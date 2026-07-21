package domain.pedido;

import domain.cliente.Cliente;
import domain.interfaces.TemDesconto;
import domain.item.ItemPedido;
import util.exceptions.ClienteNaoEnconstradoException;
import util.exceptions.EstoqueInsuficienteException;
import util.exceptions.ValorInvalidoException;

import java.time.LocalDateTime;

public class Pedido {
    private Cliente cliente;
    private ItemPedido item;
    private double valorTotal;
    private LocalDateTime dataHora;

    public Pedido(Cliente cliente, ItemPedido item) {
        if (item == null){
            throw new ValorInvalidoException("Informe o item!");
        } else if (cliente == null) {
            throw new ClienteNaoEnconstradoException();
        } else if (item.getQuantidade() > item.getProduto().getQuantidadeEmEstoque()) {
            throw new EstoqueInsuficienteException("Quantidade desejada maior que a quantidade em estoque");
        } else{
            this.cliente = cliente;
            this.item = item;
            this.dataHora = LocalDateTime.now();
            double valorBruto = calcularValorTotal();
            this.valorTotal = valorBruto - cliente.calcularDesconto(valorBruto);
            item.getProduto().baixarEstoque(item.getQuantidade());
            PedidosList.pedidos.add(this);
        }
    }

    private double calcularValorTotal(){
        return this.item.getQuantidade() * this.item.getProduto().getPreco();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public ItemPedido getItem() {
        return item;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
package domain.pedido;

import domain.cliente.Cliente;
import domain.item.ItemPedido;
import util.exceptions.ClienteNaoEnconstradoException;
import util.exceptions.EstoqueInsuficienteException;
import util.exceptions.ValorInvalidoException;

import java.time.LocalDateTime;

public class Pedido {
    private Cliente cliente;
    private ItemPedido item;
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
            PedidosList.pedidos.add(this);
        }
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
}
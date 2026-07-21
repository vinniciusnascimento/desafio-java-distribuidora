package domain.pedido;

import domain.cliente.Cliente;
import domain.item.ItemPedido;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private ItemPedido item;
    private LocalDateTime dataHora;

    public Pedido(Cliente cliente, ItemPedido item) {
        this.cliente = cliente;
        this.item = item;
        this.dataHora = LocalDateTime.now();
        PedidosList.pedidos.add(this);
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
package domain.pedido;

import domain.cliente.Cliente;
import domain.item.ItemPedido;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    public List<ItemPedido> itens;
    private LocalDateTime dataHora;

    public Pedido(Cliente cliente, List<ItemPedido> itens) {
        this.cliente = cliente;
        this.itens = itens;
        this.dataHora = LocalDateTime.now();
        PedidosList.pedidos.add(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
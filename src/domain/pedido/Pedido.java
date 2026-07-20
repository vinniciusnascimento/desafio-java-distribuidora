package domain.pedido;

import domain.cliente.Cliente;
import domain.item.ItemPedido;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private LocalDateTime dataHora;

    public Pedido(Cliente cliente, List<ItemPedido> itens) {
        this.cliente = cliente;
        this.itens = itens;
        this.dataHora = LocalDateTime.now();
    }
}

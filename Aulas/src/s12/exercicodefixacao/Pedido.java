package s12.exercicodefixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date data;
    private EstadoDoPedido estado;
    private Cliente cliente;
    private List<ItemDoPedido> itensDoPedido = new ArrayList<>();

    public Pedido(Date data, EstadoDoPedido estado, Cliente cliente) {
        this.data = data;
        this.estado = estado;
        this.cliente = cliente;
    }

    public void addPedido(ItemDoPedido item) {
        itensDoPedido.add(item);
    }

    public void removePedido(ItemDoPedido item) {
        itensDoPedido.remove(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemDoPedido i : itensDoPedido) {
            total += i.subTotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public EstadoDoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoDoPedido estado) {
        this.estado = estado;
    }

    public List<ItemDoPedido> getItensDoPedido() {
        return itensDoPedido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data do pedido: ").append(sdf.format(data)).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append("Cliente: ")
                .append(cliente.getNome())
                .append(" (")
                .append(sdf.format(cliente.getDataDeNascimento()))
                .append(") - ")
                .append(cliente.getEmail())
                .append("\n");

        sb.append("Itens:\n");
        for (ItemDoPedido i : itensDoPedido) {
            sb.append(" - ")
                    .append(i.getProduto().getNome())
                    .append(", $")
                    .append(String.format("%.2f", i.getProduto().getPreco()))
                    .append(", Quantidade: ")
                    .append(i.getQtdd())
                    .append(", Subtotal: $")
                    .append(String.format("%.2f", i.subTotal()))
                    .append("\n");
        }

        sb.append("Total do pedido: $")
                .append(String.format("%.2f", this.calcularTotal()))
                .append("\n");

        return sb.toString();
    }

}

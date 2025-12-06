package s12;

import s12.enums.EstadoDoPedido;
import java.util.Date;

public class Pedido {

    Integer id;
    Date dataDoPedido;
    EstadoDoPedido estado;

    public Pedido() {
    }

    public Pedido(Integer id, Date dataDoPedido, EstadoDoPedido estado) {
        this.id = id;
        this.dataDoPedido = dataDoPedido;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", dataDoPedido=" + dataDoPedido + ", estado=" + estado + '}';
    }

}

package s12;

import java.util.Date;

public class S12 {

    public static void enumeracao() {
        Pedido order = new Pedido(1080, new Date(), EstadoDoPedido.PENDING_PAYMENT);

        System.out.println(order);

        EstadoDoPedido os1 = EstadoDoPedido.DELIVERED;

        EstadoDoPedido os2 = EstadoDoPedido.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}

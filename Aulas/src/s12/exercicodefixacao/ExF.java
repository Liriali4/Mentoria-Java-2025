package s12.exercicodefixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExF {

    public static void gestaoDePedidos() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner input = new Scanner(System.in);

        System.out.println("#Dados do Cliente");
        System.out.print("  - Nome: ");
        String cNome = input.nextLine();

        System.out.print("  - Email: ");
        String cEmail = input.nextLine();

        System.out.print("  - Data de nascimento (DD/MM/YYYY): ");
        String dateStr = input.next();

        Date contDate = null;
        try {
            contDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Erro: data inválida!");
            return;
        }

        Cliente c = new Cliente(cNome, cEmail, contDate);

        // --- Dados do Pedido ---
        System.out.println("#Dados do pedido");

        input.nextLine(); // limpar buffer antes do nextLine

        System.out.print("  - Estado: ");
        String pEstado = input.nextLine();

        // Data atual para o pedido
        Date dataPedido = new Date();

        Pedido p = new Pedido(dataPedido, 
                EstadoDoPedido.valueOf(pEstado.toUpperCase()), 
                c
        );

        System.out.print("  - Quantos ítens o pedido terá: ");
        int qtdd = input.nextInt();

        for (int i = 1; i <= qtdd; i++) {
            System.out.println("Item #" + i + ": ");

            input.nextLine(); // limpar buffer antes de nextLine()

            System.out.print("  - Nome do produto: ");
            String pNome = input.nextLine();

            System.out.print("  - Preço do produto: ");
            double pPreco = input.nextDouble();

            Produto produto = new Produto(pNome, pPreco);

            System.out.print("  - Quantidade: ");
            int pQtdd = input.nextInt();

            ItemDoPedido item = new ItemDoPedido(pQtdd, produto);
            p.addPedido(item);
        }

        System.out.println("\nPedido registado com sucesso!\n");
        System.out.println("------------------------------------------------\n");
        System.out.println(p);
    }
}

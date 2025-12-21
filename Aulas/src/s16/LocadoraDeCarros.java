package s16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import s16.entidades.CarroAlugado;
import s16.entidades.Veiculo;
import s16.services.CarroAlugadoService;
import s16.services.TaxService;

public class LocadoraDeCarros {

    public static void locadoraDeCarros() {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = input.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), fmt);

        CarroAlugado carro = new CarroAlugado(start, finish, new Veiculo(model));

        System.out.print("Entre com o preço por hora: ");
        Double precoPorHora = input.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        Double precoPorDia = input.nextDouble();

        CarroAlugadoService carroAlugadoService = new CarroAlugadoService(precoPorHora, precoPorDia, new TaxService());
        carroAlugadoService.gerarFactura(carro);

        System.out.println("FACTURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", carro.getFactura().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", carro.getFactura().getTax()));
        System.out.println("Pagamento Total: " + String.format("%.2f", carro.getFactura().getTotalPayment()));

    }
}

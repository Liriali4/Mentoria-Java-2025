package s16.services;

import java.time.Duration;
import s16.entidades.CarroAlugado;
import s16.entidades.Factura;

public class CarroAlugadoService {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxInterface taxService;

    public CarroAlugadoService(Double precoPorHora, Double precoPorDia, TaxInterface tax) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxService = tax;
    }

    public void gerarFactura(CarroAlugado carro) {
        double minutos = Duration.between(carro.getStart(), carro.getFinish()).toMinutes();
        double horas = minutos / 60.0;

        double basicPayment;
        if (horas <= 12.0) {
            basicPayment = precoPorHora * Math.ceil(horas);
        } else {
            basicPayment = precoPorDia * Math.ceil(horas/24);
        }

        double tax = taxService.tax(basicPayment);
        
        carro.setFactura(new Factura(basicPayment, tax));
    }
}

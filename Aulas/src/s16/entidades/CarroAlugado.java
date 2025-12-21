package s16.entidades;

import java.time.LocalDateTime;

public class CarroAlugado {
    private LocalDateTime start;
    private LocalDateTime finish;
    
    private Veiculo veiculo;
    private Factura factura;

    public CarroAlugado() {
    }

    public CarroAlugado(LocalDateTime start, LocalDateTime finish, Veiculo veiculo) {
        this.start = start;
        this.finish = finish;
        this.veiculo = veiculo;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    
}

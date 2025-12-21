package s16.entidades;

public class Factura {
    private Double basicPayment;
    private Double tax;

    public Factura() {
    }

    public Factura(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return getBasicPayment() - getTax();
    }
    
    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    
}

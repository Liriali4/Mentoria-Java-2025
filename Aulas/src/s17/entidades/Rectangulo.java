package s17.entidades;

public class Rectangulo implements Shape {

    private Double largura;
    private Double altura;

    public Rectangulo() {
        super();
    }

    public Rectangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

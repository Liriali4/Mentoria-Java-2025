package s13.classesAbstratas;

public class Circulo extends AbstractForma {

    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Double raio, Cor cor) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public double perimetro() {
        return Math.PI * raio * 2;
    }
}

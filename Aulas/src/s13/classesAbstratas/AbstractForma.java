package s13.classesAbstratas;

public abstract class AbstractForma implements Forma{
    private Cor cor;

    public AbstractForma() {
    }

    public AbstractForma(Cor cor) {
        this.cor = cor;
    }
    
    public abstract double area();
    
    public abstract double perimetro();

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
}

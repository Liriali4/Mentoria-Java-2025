package s13.ex1;

public class FuncionarioExterno extends Funcionario {

    private Double custoAdicional;

    public FuncionarioExterno() {
        super();
    }

    public FuncionarioExterno(Double custoAdicional, String nome, Integer horas, Double valorPorHora) {
        super(nome, horas, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + custoAdicional * 1.1; 
    }

    
}

package s12;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import s12.enums.NivelDeTrabalho;

public class Trabalhador {

    private String name;
    private NivelDeTrabalho nivel;
    private Double salarioBase;
    private Departamento departamento;
    private List<Contrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String name, NivelDeTrabalho nivel, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public void addContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        contratos.remove(contrato);
    }

    public double calcularGanho(int ano, int mes) {
        double soma = this.salarioBase;
        Calendar cal = Calendar.getInstance();
        for (Contrato c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes= 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelDeTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelDeTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

}

package s16.entidades;

public class Veiculo {
    private String modelo;
    
    public Veiculo(){
    }
    
    public Veiculo(String model){
        this.modelo=model;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}

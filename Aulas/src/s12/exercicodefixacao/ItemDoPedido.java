package s12.exercicodefixacao;

public class ItemDoPedido {

    private Integer qtdd;
    private Double preco;
    private Produto produto;

    public ItemDoPedido(Integer qtdd, Produto produto) {
        this.qtdd = qtdd;
        this.produto = produto;
    }

    public double subTotal() {
        return preco = qtdd * produto.getPreco();
    }

    public Integer getQtdd() {
        return qtdd;
    }

    public void setQtdd(Integer qtdd) {
        this.qtdd = qtdd;
    }

    public Double getPreco() {
        return preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}

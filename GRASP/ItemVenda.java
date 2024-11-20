public class ItemVenda{
    private Produto produto;
    private int qtde;
    private double subtotal;

    public ItemVenda(Produto produto, int qtde){
        this.produto = produto;
        this.qtde = qtde;
        this.subtotal = this.produto.getPreco() * this.qtde;
    }

    public double getSubtotal(){
        return this.subtotal;
    }
}
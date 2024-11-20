import java.util.List;

public class Venda {
    private List<ItemVenda> itens;

    public Venda(List<ItemVenda> itens){
        this.itens = itens;
    }

    public void adicionarItem(Produto produto, int qtde){
        this.itens.add(new ItemVenda(produto, qtde));
    }

    public List<ItemVenda> getItens(){
        return this.itens;
    }

    public double getTotal(){
        double total = 0;
        for(ItemVenda item : this.itens){
            total += item.getSubtotal();
        }
        return total;
    }
}

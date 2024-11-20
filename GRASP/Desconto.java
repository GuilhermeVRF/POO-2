import java.util.List;

public class Desconto implements Taxa{
    private final double TAXA_DESCONTO = 0.25;

    public double calcularTaxa(Venda venda){
        double descontoTotal = 0;
        List<ItemVenda> itens = venda.getItens();

        for(ItemVenda item: itens){
            descontoTotal += item.getSubtotal() * TAXA_DESCONTO;
        }

        return descontoTotal;
    }
}
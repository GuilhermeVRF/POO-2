public class QuatroQueijos extends Decorador {
    public QuatroQueijos(Pizza pizza){
        super(pizza);
    }

    public String getDescricao(){
        return super.getDescricao() + ", Cheddar, Queijo Minas, Requeijão";
    }

    public double getPreco(){
        return super.getPreco();
    }
}

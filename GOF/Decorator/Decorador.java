public class Decorador implements Pizza{
    protected Pizza pizza;

    public Decorador(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescricao(){
        return pizza.getDescricao();
    }

    public double getPreco(){
        return pizza.getPreco();
    }
}

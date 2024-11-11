public class Calabreza extends Decorador {
    public Calabreza(Pizza quatroQueijos){
        super(quatroQueijos);    
    }

    public String getDescricao(){
        return super.getDescricao() + ", Calabresa, Orégano";
    }

    public double getPreco(){
        return super.getPreco() + 25;
    }
}

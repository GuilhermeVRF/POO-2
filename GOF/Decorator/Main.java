public class Main {
    public static void main(String[] args) {
        System.out.println("Pizza básica");
        PizzaBasica pizzaBasica = new PizzaBasica();
        System.out.println("Sabor: "+ pizzaBasica.getDescricao() + " - R$ "+ pizzaBasica.getPreco());

        Pizza quatroQueijos = new QuatroQueijos(pizzaBasica);
        System.out.println("Quatro Queijos: "+ quatroQueijos.getDescricao());

        Calabreza calabreza = new Calabreza(quatroQueijos);
        System.out.println("Calabreza: "+ calabreza.getDescricao());
    }
}

public class Investidor implements Observador{
    private static int contador = 0;
    private Sujeito bolsa;
    private int id;

    public Investidor(Sujeito bolsa){
        this.id = contador++;
        this.bolsa = bolsa;
        this.bolsa.registrar(this);
    }

    public void atualizar(int precoIBM, int precoIntel, int precoGoogle, int precoApple){
        this.printarPrecos(precoIBM, precoIntel, precoGoogle,precoApple);
    }

    private void printarPrecos(int precoIBM, int precoIntel, int precoGoogle, int precoApple){
        System.out.println("IBM: "+ precoIBM);
        System.out.println("Intel: "+ precoIntel);
        System.out.println("Google: "+ precoGoogle);
        System.out.println("Apple: "+ precoApple);
    }
}
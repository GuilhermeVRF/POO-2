public class Main{
    public static void main(String[] args){
        Ibovespa ibovespa = new Ibovespa();

        Investidor i1 = new Investidor(ibovespa);
        Investidor i2 = new Investidor(ibovespa);
        Investidor i3 = new Investidor(ibovespa);
        Investidor i4 = new Investidor(ibovespa);

        ibovespa.setPrecoIBM(120);
        ibovespa.setPrecoGoogle(300);

        ibovespa.notificarObservador();
    }
}
package GOF.Composite;

public class Musica extends ComponenteMusical {
    private String nomeMusica;
    private String nomeBanda;
    private int ano;

    public Musica(String nomeMusica, String nomeBanda, int ano){
        this.nomeMusica = nomeMusica;
        this.nomeBanda = nomeBanda;
        this.ano = ano;
    }

    public String getNomeBanda(){
        return this.nomeBanda;
    }

    public int getAno(){
        return this.ano;
    }

    public void exibirInformacoes(){
        System.out.println(this.nomeMusica + " - " + this.ano + " By " + this.nomeBanda);
    }
}

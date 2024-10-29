package GOF.Composite;

public class Main {
    public static void main(String[] args){
        ComponenteMusical album = new Album("Capital Inicial - Acústico");
        album.adiciona(new Musica("Vou estar", "Capital Inicial", 2005));
        album.adiciona(new Musica("Primeiros erros", "Capital Inicial", 2005));
        album.adiciona(new Musica("Natasha", "Capital Inicial", 2005));

        ComponenteMusical album2 = new Album("Engenheiros do Avaí - Acústico");
        album2.adiciona(new Musica("Dom Quixote", "Engenheiros do Avaí", 2016));
        album2.adiciona(new Musica("3x4", "Engenheiros do Avaí",2016));

        album.adiciona(album2);

        album.exibirInformacoes();
    }
}

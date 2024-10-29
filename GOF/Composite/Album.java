package GOF.Composite;
import java.util.List;
import java.util.ArrayList;
public class Album extends ComponenteMusical {
    private List<ComponenteMusical> album;
    private String nomeAlbum;

    public Album(String nomeAlbum){
        this.nomeAlbum = nomeAlbum;
        this.album = new ArrayList<>();
    }

    public String getNomeAlbum(){
        return this.nomeAlbum;
    }

    public void adiciona(ComponenteMusical musica){
        this.album.add(musica);
    }

    public ComponenteMusical getMusica(int indice){
        return this.album.get(indice);
    }

    public void exibirInformacoes(){
        System.out.println(this.nomeAlbum);
        for(ComponenteMusical componenteMusical : this.album){
            componenteMusical.exibirInformacoes();
        }
    }
}

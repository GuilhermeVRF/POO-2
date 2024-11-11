package GOF.Bridge.TV;

public class Main {

    public static void manipulateDispositive(ControleRemoto controleRemoto){
        controleRemoto.btnNove();
    }
    public static void main(String args[]){
        ControleRemoto tvMuda = new TVMuda(new TV(10, 12));
        manipulateDispositive(tvMuda);

        ControleRemoto tvPausada = new TVPausa(new TV(5, 7));
        manipulateDispositive(tvPausada);

        ControleRemoto mp3Pausado = new MP3Pausa(new MP3(0, 0, 10));
        manipulateDispositive(mp3Pausado);
    }
}

package GOF.Bridge.TV;

public class MP3Pausa extends ControleRemoto{
    public MP3Pausa(Dispositivo dispositivo){
        super(dispositivo);
    }

    public void btnNove(){
        System.out.println("MP3 mutado!");
    }
}

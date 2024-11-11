package GOF.Bridge.TV;

public class TVMuda  extends ControleRemoto{
    private boolean mute;

    public TVMuda(Dispositivo dispositivo){
        super(dispositivo);
    }

    public void btnNove(){
        this.mute = !this.mute;
        System.out.println("TV Mutado: "+ (this.mute ? "Sim" : "Não"));
    }
}

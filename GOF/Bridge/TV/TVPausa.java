package GOF.Bridge.TV;

public class TVPausa extends ControleRemoto {
    private boolean paused;
    
    public TVPausa(Dispositivo dispositivo){
        super(dispositivo);
        this.paused = false;
    }

    public void btnNove(){
        this.paused = !this.paused;
        System.out.println("TV pausada :"+ (this.paused ? "Sim" : "Não"));
    }
}

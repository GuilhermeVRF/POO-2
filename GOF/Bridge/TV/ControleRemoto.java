package GOF.Bridge.TV;

/* Por ser uma ponte permite o uso da implementação, assim como uma extensibilidade separadamente */
public abstract class ControleRemoto{
    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }

    public void btnCinco(){
        this.dispositivo.btnCinco();
    }

    public void btnSeis(){
        this.dispositivo.btnSeis();
    }

    public void feedBackDispositivo(){
        this.dispositivo.feedBackDispositivo();
    }

    public abstract void btnNove();
}

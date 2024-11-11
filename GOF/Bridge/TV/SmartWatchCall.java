package GOF.Bridge.TV;

public class SmartWatchCall extends ControleRemoto{
    public SmartWatchCall(Dispositivo dispositivo){
        super(dispositivo);
    }

    public void btnNove(){
        System.out.println("Ligando!");
    }
}

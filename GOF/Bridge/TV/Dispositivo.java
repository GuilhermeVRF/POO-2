package GOF.Bridge.TV;

public abstract class Dispositivo {
    protected int estado, volume, maximo;

    public abstract void btnCinco();
    public abstract void btnSeis();

    public void feedBackDispositivo(){
        if(estado > maximo || estado < 0) this.estado = 0;
        System.out.println("Atualmente em : "+ this.estado);
    }

    public void btnSete(){
        this.volume++;
        System.out.println("Volume em: "+ this.volume);
    }

    public void btnOito(){
        this.volume--;
        System.out.println("Volume em: "+ this.volume);
    }
}

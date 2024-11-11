package GOF.Bridge.TV;

public class SmartWatch extends Dispositivo{
    public SmartWatch(int estado, int volume,int maximo){
        this.estado = estado;
        this.volume = volume;
        this.maximo = maximo;
    }

    public void btnCinco(){
        this.estado++;
        if(this.estado == this.maximo) this.estado = 0;
        System.out.println("Tela "+ this.estado + "/" + this.maximo);
    }

    public void btnSeis(){
        this.estado--;
        if(this.estado == -1) this.estado = 0;
        System.out.println("Tela "+ this.estado + "/" + this.maximo);
    }
}

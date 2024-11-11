package GOF.Bridge.TV;

public class TV extends Dispositivo {
    public TV(int estado, int maximo){
        this.estado = estado;
        this.maximo = maximo;
    }

    public void btnCinco(){
        this.estado++;
        System.out.println("Cana Down: "+ this.estado);
    }

    public void btnSeis(){
        this.estado--;
        System.out.println("Cana Up: "+ this.estado);
    }
}

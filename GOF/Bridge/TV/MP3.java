package GOF.Bridge.TV;

public class MP3 extends Dispositivo {
    public MP3(int estado, int volume, int maximo){
        this.estado = estado;
        this.volume = volume;
        this.maximo = maximo;
    }

    public void btnCinco(){
        this.estado++;
        if(this.estado == this.maximo) this.estado = 1;
        
        System.out.println("Tocando a música de posição: "+ this.estado);
    }

    public void btnSeis(){
        this.estado--;
        if(this.estado == -1) this.estado = 0;
        System.out.println("Tocando a música de posição: "+ this.estado);
    }
}

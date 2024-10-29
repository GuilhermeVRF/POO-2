import java.util.List;
import java.util.ArrayList;

public class Ibovespa implements Sujeito{
    private List<Observador> observadores;
    private int precoIntel, precoIBM, precoGoogle, precoApple;

    public Ibovespa(){
        this.observadores = new ArrayList<>();
    }

    public void registrar(Observador observador){
        this.observadores.add(observador);
    }

    public void remover(Observador observador) {}

    public void notificarObservador(){
        for(Observador observador : this.observadores){
            observador.atualizar(precoIBM, precoIntel, precoGoogle, precoApple);
        }
    }

    public void setPrecoIBM(int precoIBM){
        this.precoIBM = precoIBM;
    }

    public void setPrecoIntel(int precoIntel){
        this.precoIntel = precoIntel;
    }

    public void setPrecoGoogle(int precoGoogle){
        this.precoGoogle = precoGoogle;
    }

    public void setPrecoApple(int precoApple){
        this.precoApple = precoApple;
    }
}
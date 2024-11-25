package GOF.Factory;

public class ShipLogistic implements Logistic {
    public Transport createTransport() {
        return new Ship();
    }
}

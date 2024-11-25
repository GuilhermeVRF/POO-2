package GOF.Factory;

public class RoadLogistic implements Logistic {
    public Transport createTransport() {
        return new Truck();
    }
}

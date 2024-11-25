package GOF.Factory;

public class main {
    public static void main(String[] args){
        String type = "ship";
        Transport logistic = null;
        switch (type) {
            case "road":
                logistic = new RoadLogistic().createTransport();    
            break;
        
            default:
                logistic = new ShipLogistic().createTransport();
            break;
        }

        logistic.deliver();
    }
}

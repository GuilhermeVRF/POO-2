package GOF.Bridge.API;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RestAPIRequest restAPIRequest = new RestAPIRequest();
        SoapAPIRequest soapAPIRequest = new SoapAPIRequest();

        AbstractAPIRequest apiRequester = new AbstractAPIRequest(restAPIRequest);
        System.out.println(apiRequester.fetchData(new HashMap<>()));

        apiRequester = new AbstractAPIRequest(soapAPIRequest);
        System.out.println(apiRequester.fetchData(new HashMap<>()));
    }
}

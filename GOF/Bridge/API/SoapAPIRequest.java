package GOF.Bridge.API;
import java.util.Map;

public class SoapAPIRequest implements APIRequest {
    public String fetchData(Map<String, String> options){
        return "<name> : \"Guilherme\" </name> ";
    }
}

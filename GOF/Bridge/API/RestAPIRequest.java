package GOF.Bridge.API;
import java.util.Map;

public class RestAPIRequest  implements APIRequest{
    public String fetchData(Map<String, String> options){
        return "{ name : \"Guilherme\" }";
    }
}

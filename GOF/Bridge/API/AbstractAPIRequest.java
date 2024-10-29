package GOF.Bridge.API;
import java.util.Map;

public class AbstractAPIRequest {
    private APIRequest apiRequest;
    public AbstractAPIRequest(APIRequest apiRequest){
        this.apiRequest = apiRequest;
    }   

    public String fetchData(Map<String, String> options){
        return this.apiRequest.fetchData(options);
    }
}

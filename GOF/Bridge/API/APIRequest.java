package GOF.Bridge.API;
import java.util.Map;

public interface APIRequest {
    public String fetchData(Map<String, String> options);
}

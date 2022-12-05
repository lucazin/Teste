import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimit {

    public static void main(String[] args) {
               

    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {

        Map<String, Integer> ok = new HashMap<>();

        if (timestamp < ok.getOrDefault(message, 0))
            return false;
        ok.put(message, timestamp + 10);
        return true;
    }
    
}


package genericfilehandlingsystem;

import java.util.List;
import java.util.Map;

public interface TextFormatStrategy {

    List<Map<String, String>> decode(List<String> dataFromFile);

    String encode(List<Map<String, String>> dataFromApp);
    
}

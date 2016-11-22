package genericfilehandlingsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomeGarageFormat implements TextFormatStrategy {

    /*
    line 1: (hours)
    line 2: (amount)
    
    encoding and decoding
     */
    private final String CRLF = "\n";

    @Override
    public String encode(List<Map<String, String>> dataFromApp) {
        //place validation code here
        Map<String, String> sourceData = dataFromApp.get(0);
        String sTotalHours = sourceData.get("totalHours");
        String sTotalFees = sourceData.get("totalFees");
        return sTotalHours + CRLF + sTotalFees + CRLF;
    }

    @Override
    public List<Map<String, String>> decode(List<String> dataFromFile) {
        String sTotalHours = dataFromFile.get(0);
        String sTotalFees = dataFromFile.get(1);
        List<Map<String, String>> appData = new ArrayList<>();
        Map<String, String> record = new HashMap<>();
        record.put("totalHours", sTotalHours);
        record.put("totalFees", sTotalFees);
        appData.add(record);
        return appData;
    }

    public static void main(String[] args) {
        /*
        Encode
         */
        TextFormatStrategy formatObject = new CustomeGarageFormat();
//        List<Map<String,String>> dataFromApp = new ArrayList<>();
//        Map<String,String> record = new HashMap<>();
//        record.put("totalHours", "20.5");
//        record.put("totalFees", "33.75");
//        dataFromApp.add(record);
//        String formatted = formatObject.encode(dataFromApp);
//        System.out.println(formatted);

        /*
        decode
         */
        List<String> dataFromFile = Arrays.asList("20.50", "33.75");
        List<Map<String, String>> appData = formatObject.decode(dataFromFile);
        System.out.println(appData);
    }
}

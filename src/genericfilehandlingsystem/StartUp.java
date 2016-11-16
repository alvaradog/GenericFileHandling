
package genericfilehandlingsystem;

import java.io.File;

public class StartUp {
    public static void main(String[] args) {
        FileIOReader fileReader;
        File data = new File("src" + File.separatorChar
                + "testFile.csv");
        
        fileReader = new CsvFileReader(data);
        System.out.println(fileReader.readFile());
    }
    
}

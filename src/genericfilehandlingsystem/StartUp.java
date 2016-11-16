
package genericfilehandlingsystem;

import java.io.File;
import javax.swing.JOptionPane;

public class StartUp {
    public static void main(String[] args) {
        FileIOReader fileReader;
        File data = new File("src" + File.separatorChar
                + "testFile.csv");
        
        fileReader = new CsvFileReader(data);
//        System.out.println(fileReader.readFile());
        JOptionPane.showMessageDialog(null,fileReader.readFile());
    }
    
}

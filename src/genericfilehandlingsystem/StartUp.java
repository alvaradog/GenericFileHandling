
package genericfilehandlingsystem;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class StartUp {
    public static void main(String[] args) throws IOException {
        FileIOReader fileReader;
        FileIOWriter fileWriter;
        File data = new File("src" + File.separatorChar
                + "testFile.csv");
        
//        fileReader = new CsvFileReader(data);
//        JOptionPane.showMessageDialog(null,fileReader.readFile());
//        String msg = JOptionPane.showInputDialog(null, 
//                "Please enter a message to add");
//        fileWriter = new CsvFileWriter(data);
//        fileWriter.writeFile(msg);
//        JOptionPane.showMessageDialog(null,fileReader.readFile());
    }
    
}

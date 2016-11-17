package genericfilehandlingsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Class is NOT COMPLETE - Need to FIX .replace(","," ")
 * @author alvaradog
 */
public class CsvFileReader implements FileIOReader {

    private File data;
    List<String> lines = new ArrayList();
    BufferedReader in = null;

    public CsvFileReader(File data) {
        this.data = data;
    }

    @Override
    public final List<String> readFile() {
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            lines.add(line);
            while (line != null) {
                line = in.readLine();// strips out any carriage return chars
                /**
                 * The replace() is not working correctly
                 */
//                line = line.replaceAll(" ", ",");
                lines.add(line);
            }

        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null,
                    "There is an issue reading this file type");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
        return lines;
    }
}


package genericfilehandlingsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvFileWriter implements FileIOWriter{
    private File data;
    private PrintWriter out;
    private boolean append = true;

    public CsvFileWriter(File data) throws IOException {
        this.data = data;
        out = new PrintWriter(new BufferedWriter(
                new FileWriter(data, append)));
    }

    @Override
    public final void writeFile(String msg) {
        append = true;
        out.print(msg);
        out.close();
    }
    
}

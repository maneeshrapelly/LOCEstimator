package parsers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileParser implements Parser {
    private String filePath;

    public FileParser(String path) {
        this.filePath = path;
    }

    @Override
    public ArrayList<String> parse() throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        try (
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line.trim());
            }
        }
        catch (IOException ioe) {
            throw ioe;
        }
        return lines;
    }
}

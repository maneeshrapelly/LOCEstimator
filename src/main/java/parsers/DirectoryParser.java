package parsers;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Parses a directory
 */
public class DirectoryParser implements Parser {
    private String filePath;

    public DirectoryParser(String path) {
        this.filePath = path;
    }

    @Override
    public ArrayList<String> parse() throws IOException {
        return new ArrayList<>();
    }
}

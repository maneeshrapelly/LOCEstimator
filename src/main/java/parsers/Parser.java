package parsers;

import java.io.IOException;
import java.util.ArrayList;

public interface Parser {
    /**
     * Parse input file
     * @return list of lines
     * @throws IOException
     */
    ArrayList<String> parse() throws IOException;
}

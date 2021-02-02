package parsers;

import java.io.IOException;
import java.util.ArrayList;

public interface Parser {
    ArrayList<String> parse() throws IOException;
}

package strategy;

import java.util.ArrayList;

public interface LanguageStrategy {

    /**
     * Classify each line as per the language syntax and print the output to console
     * @param lines input file content
     */
    void countLines(ArrayList<String> lines);
}

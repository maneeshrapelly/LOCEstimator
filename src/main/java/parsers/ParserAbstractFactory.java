package parsers;

public interface ParserAbstractFactory {
    /**
     * Creates parser object
     * @param path input file path
     * @return parser object
     */
    Parser createParser(String path);
}

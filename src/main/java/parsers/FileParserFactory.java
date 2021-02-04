package parsers;

/**
 * Factory class for {@link FileParser}
 */
public class FileParserFactory implements ParserAbstractFactory {
    @Override
    public Parser createParser(String path) {
        return new FileParser(path);
    }
}

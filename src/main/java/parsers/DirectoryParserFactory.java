package parsers;

/**
 * Factor class for {@link DirectoryParser}
 */
public class DirectoryParserFactory implements ParserAbstractFactory {
    @Override
    public Parser createParser(String path) {
        return new DirectoryParser(path);
    }
}

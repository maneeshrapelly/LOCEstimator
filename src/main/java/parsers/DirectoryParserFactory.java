package parsers;

public class DirectoryParserFactory implements ParserAbstractFactory {
    @Override
    public Parser createParser(String path) {
        return new DirectoryParser(path);
    }
}

package parsers;

public class FileParserFactory implements ParserAbstractFactory {
    @Override
    public Parser createParser(String path) {
        return new FileParser(path);
    }
}

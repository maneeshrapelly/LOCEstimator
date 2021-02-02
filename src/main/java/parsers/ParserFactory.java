package parsers;

public class ParserFactory {

    public static Parser getParser(ParserAbstractFactory abstractFactory, String path) {
        return abstractFactory.createParser(path);
    }
}

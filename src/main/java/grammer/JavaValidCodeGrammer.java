package grammer;

public class JavaValidCodeGrammer implements JavaGrammer {

    /*
    @Override
    public boolean isMatches(String line) {
        return false;
    }
*/

    @Override
    public String getRegex() {
        return ".+";
    }

    @Override
    public String getType() {
        return "CODE";
    }
}

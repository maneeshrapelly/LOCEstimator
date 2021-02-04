package grammer;

/**
 * Code grammer which is not a blank line and not a single line comment in java
 */
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

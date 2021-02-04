package grammer;

/**
 * Single line Comment Grammer
 * e.g: // this is simgle line comment
 */
public class JavaSingleLineCommentGrammer implements JavaGrammer {

/*
    @Override
    public boolean isMatches(String line) {
        return false;
    }
*/

    @Override
    public String getRegex() {
    return "^\\/\\/";
    }

    @Override
    public String getType() {
        return "COMMENT";
    }
}

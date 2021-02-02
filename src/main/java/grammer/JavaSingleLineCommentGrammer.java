package grammer;

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

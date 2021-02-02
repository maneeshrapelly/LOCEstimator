package grammer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface JavaGrammer {

    default boolean isMatches(String line) {
        Pattern pattern = Pattern.compile(getRegex());
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    String getRegex();

    String getType();
}

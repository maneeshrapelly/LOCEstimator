package grammer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface JavaGrammer {

    /**
     * Checks if matches to particular syntax or not
     * @param line program single line
     * @return true if matches the regex, false otherwise
     */
    default boolean isMatches(String line) {
        Pattern pattern = Pattern.compile(getRegex());
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return regex for matching that line
     */
    String getRegex();

    /**
     * @return type of line
     */
    String getType();
}

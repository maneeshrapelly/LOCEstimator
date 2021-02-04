package strategy;

import java.util.ArrayList;
import java.util.HashMap;

import grammer.JavaGrammer;
import grammer.JavaSingleLineCommentGrammer;
import grammer.JavaValidCodeGrammer;

/**
 * Strategy class for Java programming language
 */
public class JavaLanguageStrategy implements LanguageStrategy {
    private ArrayList<JavaGrammer> grammers;


    public JavaLanguageStrategy() {
        grammers = new ArrayList<>();
        grammers.add(new JavaSingleLineCommentGrammer());
        grammers.add(new JavaValidCodeGrammer());
    }

    @Override
    public void countLines(ArrayList<String> lines) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String line: lines) {
            if (line.trim().isEmpty()) {
                countMap.put("BLANK", countMap.getOrDefault("BLANK", 0) + 1);
                continue;
            }
            for (JavaGrammer grammer: grammers) {
                if (grammer.isMatches(line) == true) {
                    countMap.put(grammer.getType(),
                            countMap.getOrDefault(grammer.getType(), 0) + 1);
                    break;
                }
            }
        }
        System.out.println(countMap);
        System.out.println("TOTAL: " + countMap.values().stream().reduce(0, Integer::sum));
    }
}

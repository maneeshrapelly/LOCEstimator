import java.util.ArrayList;

import strategy.LanguageStrategy;

public interface LOCEstimator {

    /**
     * Enum for denoting each programming language
     */
    enum LANGUAGE {
        JAVA("java"),
        C("c"),
        JAVASCRIPT("javascript");

        LANGUAGE(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        private final String name;
    }

    LanguageStrategy getStrategy();

    void estimate(ArrayList<String> lines);
}

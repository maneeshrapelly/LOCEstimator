import java.util.ArrayList;

import strategy.CLanguageStrategy;
import strategy.JavaLanguageStrategy;
import strategy.JavascriptLanguageStrategy;
import strategy.LanguageStrategy;

public class LOCEstimatorImpl implements LOCEstimator {

    private final LanguageStrategy strategy;

    private LOCEstimatorImpl(LanguageStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Builder class for {@link LOCEstimatorImpl}
     */
    public static class Builder {
        private final LANGUAGE lang;

        public Builder(LANGUAGE lang) {
            this.lang = lang;
        }

        public static Builder newJavaLOCEstimator() {
            return new Builder(LANGUAGE.JAVA);
        }

        public static Builder newCLOCEstimator() {
            return new Builder(LANGUAGE.C);
        }

        public static Builder newJavascriptLOCEstimator() {
            return new Builder(LANGUAGE.JAVASCRIPT);
        }

        public LOCEstimatorImpl build() {
            LanguageStrategy strategy = null;
            switch (lang) {
                case JAVA:
                    strategy = new JavaLanguageStrategy();
                    break;
                case C:
                    strategy = new CLanguageStrategy();
                    break;
                case JAVASCRIPT:
                    strategy = new JavascriptLanguageStrategy();
                    break;
                default:
                    throw new IllegalArgumentException("Specified language is not supported");
            }
            return new LOCEstimatorImpl(strategy);
        }
    }

    @Override
    public LanguageStrategy getStrategy() {
        return strategy;
    }

    @Override
    public void estimate(ArrayList<String> lines) {
        strategy.countLines(lines);
    }
}

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import parsers.DirectoryParserFactory;
import parsers.FileParserFactory;
import parsers.Parser;
import parsers.ParserFactory;

public class LOCEstimatorTest {

    public static LOCEstimatorImpl getEstimator(String input) {
        if (input.endsWith(".java")) {
            return LOCEstimatorImpl.Builder.newJavaLOCEstimator().build();
        } else if (input.endsWith(".c")) {
            return LOCEstimatorImpl.Builder.newCLOCEstimator().build();
        } else if (input.endsWith(".js")) {
            return LOCEstimatorImpl.Builder.newJavascriptLOCEstimator().build();
        }
        return null;
    }

    private static void estimateFile(String input) {
        Parser parser = ParserFactory.getParser(new FileParserFactory(), input);
        LOCEstimator estimator = getEstimator(input);
        try {
            if (estimator != null) {
                estimator.estimate(parser.parse());
            } else {
                System.out.println("Unsupported file type. Provide Java/C/Javascript files");
                return;
            }
        } catch (IOException ioe) {
            System.out.println("Failed to parse input file");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter file path");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        File file = new File(input);
        if (file.isFile()) {
            estimateFile(input);
        } else {
            System.out.println("Wrong input!, make sure file exists and " +
                    "provide absolute path of a file");
            return;
        }
    }
}

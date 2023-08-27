import java.util.*;
/**
 * The BlankPrintlnCheck class is a specific implementation of the Check interface that checks
 * for System.out.println() statements with blank parameters.
 */
class BlankPrintlnCheck implements Check {
     /**
     * Runs the blank println check on the specified file and returns a list of any errors found.
     *
     * @param file the file to check
     * @return a List of Error instances found in the file
     */
public Optional<Error> lint(String line, int lineNumber) {
        if (line.contains("System.out.println(\"\")")) {
            return Optional.of(new Error(3, lineNumber, "Line contains System.out.println(\"\")"));
        }
        return Optional.empty();
    }
}

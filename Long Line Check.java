import java.util.*;
/**
 * The LongLineCheck class is a specific implementation of the Check interface
 * that checks for lines in a file that are longer than a certain length. It
 * takes a maximum line length as a parameter in its constructor.
 * param maxLength the maximum allowed length of a line
 */
class LongLineCheck implements Check {
    /**
     * Creates a new LongLineCheck instance with the specified maximum line
     * length.
     * param line If the line length is greater than or equal to 100, then it creates an error.
     * param lineNumber Used for the error statement.
     * return an optional error if length >= 100, empty otherwise.
     */
    public Optional<Error> lint(String line, int lineNumber) {
        if (line.length() >= 100) {
            return Optional.of(new Error(1, lineNumber, "Line length is greater than or equal to 100 characters"));
        }
        return Optional.empty();
    }
}

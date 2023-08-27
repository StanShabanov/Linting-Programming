import java.util.*;
/**
 * The BreakCheck class is a specific implementation of the Check interface
 * that checks for lines in a file that end with a "break" statement within a switch block.
 */
class BreakCheck implements Check {
     /**
     * Runs the break check on the specified file and returns a list of any errors found.
     * param file the file to check through line, and lineNumber
     * return a List of Error instances found in the file through optional
     */
    public Optional<Error> lint(String line, int lineNumber) {
        // int commentIndex = line.indexOf("//");
        // if (commentIndex != -1) {    
        //     String commentSubstring = line.substring(commentIndex);
        if (line.contains("break") && line.contains("//")) {
            if ( line.indexOf("break") < line.indexOf("//")){
                return Optional.of(new Error(2, lineNumber, "Break keyword is not inside a comment"));
            }
        }
        if (!line.contains("//") && line.contains("break")) {
                return Optional.of(new Error(2, lineNumber, "Break keyword is not inside a comment"));
        }
        return Optional.empty();
    }
}

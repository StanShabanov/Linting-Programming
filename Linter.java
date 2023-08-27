import java.util.*;
import java.io.*;

class Linter {
    private final List<Check> checks;
     /**
     * Creates a new Linter instance with the specified list of checks.
     * param checks a list of Check instances to run on the file
     */
    public Linter(List<Check> checks) {
        this.checks = checks;
    }

    /*
    * The Linter class is responsible for running a list of checks on a given file
    * and returning a list of any issues found. It takes a list of checks to run as
    * a parameter in its constructor.
    *
    * param checks a list of Check instances to run on the file
    * return a List of Error instances found in the file
    */ 
    public List<Error> lint(String fileName) throws FileNotFoundException {
        List<Error> errors = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int lineNumber = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNumber++;

            for (Check check : checks) {
                Optional<Error> error = check.lint(line, lineNumber);
                if (error.isPresent()) {
                    errors.add(error.get());
                }
            }
        }
        return errors;
    }
}

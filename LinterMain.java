import java.util.*;
import java.io.*;
/**
 * The LinterMain class contains the main method of the program. It sets up the
 * linter and runs it on a specified file.
 */
public class LinterMain {
     // The file to lint
    public static final String FILE_NAME = "TestFile.java";

    public static void main(String[] args) throws FileNotFoundException {
        List<Check> checks = new ArrayList<>();
        checks.add(new LongLineCheck());
        Linter linter = new Linter(checks);
        List<Error> errors = linter.lint(FILE_NAME);
        for (Error e : errors) {
            System.out.println(e);
        }
    }
}

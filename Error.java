import java.util.*;
import java.io.*;
/**
 * The Error class represents a specific error found by a lint check.
 */
class Error {
    private final int code;
    private final int lineNumber;
    private final String message;
    /**
     * Constructs a new Error instance with the given file name, line number, and error message.
     * param fileName the name of the file where the error occurred
     * param lineNumber the line number where the error occurred
     * param message the error message
     */
    public Error(int code, int lineNumber, String message) {
        this.code = code;
        this.lineNumber = lineNumber;
        this.message = message;
    }
    // getter for lineNumber
    public int getLineNumber() {
        return lineNumber;
    }
    // getter for code
    public int getCode() {
        return code;
    }
    //getter for message returns String
    public String getMessage() {
        return message;
    }
    //toString method for error class, returns in string format
    public String toString() {
        return "(Line: " + lineNumber + ") has error code " + code + "\n" + message;
    }
}

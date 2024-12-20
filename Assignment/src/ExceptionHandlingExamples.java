/**
 * Assignment: Understanding and Handling OOP/Java Exceptions
 * Objective: Enhance understanding of exception handling in Java.
 * Approach: Each example triggers the specified exception in a meaningful scenario
 * and demonstrates how to handle it using try-catch blocks with explanatory comments.
 */

import java.io.*;
import java.sql.*;

public class ExceptionHandlingExamples {

    public static void main(String[] args) {
        // Checked Exceptions
        handleIOException();
        handleFileNotFoundException();
        handleEOFException();
        handleSQLException();
        handleClassNotFoundException();

        // Unchecked Exceptions
        handleArithmeticException();
        handleNullPointerException();
        handleArrayIndexOutOfBoundsException();
        handleClassCastException();
        handleIllegalArgumentException();
        handleNumberFormatException();
    }

    // 1. IOException
    private static void handleIOException() {
        try {
            // Attempting to read from a non-existent file
            FileReader reader = new FileReader("nonexistent_file.txt");
            reader.read();
        } catch (IOException e) {
            System.out.println("IOException handled: " + e.getMessage());
        }
    }

    // 2. FileNotFoundException
    private static void handleFileNotFoundException() {
        try {
            // File not found scenario
            FileReader reader = new FileReader("missing_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException handled: " + e.getMessage());
        }
    }

    // 3. EOFException
    private static void handleEOFException() {
        try {
            // Simulating EOFException
            ByteArrayInputStream input = new ByteArrayInputStream(new byte[0]);
            DataInputStream dataInputStream = new DataInputStream(input);
            dataInputStream.readInt();
        } catch (EOFException e) {
            System.out.println("EOFException handled: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException handled: " + e.getMessage());
        }
    }

    // 4. SQLException
    private static void handleSQLException() {
        try {
            // Attempt to connect to a non-existent database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistent", "root", "password");
        } catch (SQLException e) {
            System.out.println("SQLException handled: " + e.getMessage());
        }
    }

    // 5. ClassNotFoundException
    private static void handleClassNotFoundException() {
        try {
            // Trying to load a non-existent class
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException handled: " + e.getMessage());
        }
    }

    // 6. ArithmeticException
    private static void handleArithmeticException() {
        try {
            // Division by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled: " + e.getMessage());
        }
    }

    // 7. NullPointerException
    private static void handleNullPointerException() {
        try {
            // Accessing a null reference
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: " + e.getMessage());
        }
    }

    // 8. ArrayIndexOutOfBoundsException
    private static void handleArrayIndexOutOfBoundsException() {
        try {
            // Accessing an invalid array index
            int[] numbers = {1, 2, 3};
            int invalid = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }

    // 9. ClassCastException
    private static void handleClassCastException() {
        try {
            // Invalid type casting
            Object obj = new Integer(5);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException handled: " + e.getMessage());
        }
    }

    // 10. IllegalArgumentException
    private static void handleIllegalArgumentException() {
        try {
            // Passing an invalid argument
            Thread thread = new Thread();
            thread.setPriority(11); // Valid priority range: 1-10
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e.getMessage());
        }
    }

    // 11. NumberFormatException
    private static void handleNumberFormatException() {
        try {
            // Invalid number format
            int number = Integer.parseInt("invalid_number");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e.getMessage());
        }
    }
}

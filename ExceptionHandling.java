import java.io.*;
import java.sql.*;

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println(" Checked Exceptions \n");
        ioExceptionExample();
        fileNotFoundExceptionExample();
        eofExceptionExample();
        sqlExceptionExample();
        classNotFoundExceptionExample();

        System.out.println("\n Unchecked Exceptions \n");
        arithmeticExceptionExample();
        nullPointerExceptionExample();
        arrayIndexOutOfBoundsExceptionExample();
        classCastExceptionExample();
        illegalArgumentExceptionExample();
        numberFormatExceptionExample();
    }

    // ======= Checked Exceptions =========

    // 1. IOException
    private static void ioExceptionExample() {
        System.out.println("1. IOException: Reading a non-existent file.");
        try {
            FileReader reader = new FileReader("nonexistent_file.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // 2. FileNotFoundException
    private static void fileNotFoundExceptionExample() {
        System.out.println("\n2. FileNotFoundException: Trying to open a missing file.");
        try {
            FileInputStream file = new FileInputStream("missing_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }

    // 3. EOFException
    private static void eofExceptionExample() {
        System.out.println("\n3. EOFException: Reading beyond the file's content.");
        try (DataInputStream dis = new DataInputStream(new ByteArrayInputStream(new byte[]{}))) {
            dis.readInt();
        } catch (EOFException e) {
            System.out.println("EOFException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // 4. SQLException
    private static void sqlExceptionExample() {
        System.out.println("\n4. SQLException: Connecting to a non-existent database.");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://invalid_host:3306/test", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }

    // 5. ClassNotFoundException
    private static void classNotFoundExceptionExample() {
        System.out.println("\n5. ClassNotFoundException: Loading a missing class.");
        try {
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }

    // ======================= Unchecked Exceptions ======================

    // 6. ArithmeticException
    private static void arithmeticExceptionExample() {
        System.out.println("\n6. ArithmeticException: Division by zero.");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    // 7. NullPointerException
    private static void nullPointerExceptionExample() {
        System.out.println("\n7. NullPointerException: Accessing a null reference.");
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    // 8. ArrayIndexOutOfBoundsException
    private static void arrayIndexOutOfBoundsExceptionExample() {
        System.out.println("\n8. ArrayIndexOutOfBoundsException: Accessing an invalid array index.");
        try {
            int[] array = {1, 2, 3};
            int value = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    // 9. ClassCastException
    private static void classCastExceptionExample() {
        System.out.println("\n9. ClassCastException: Invalid type casting.");
        try {
            Object obj = Integer.valueOf(10);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }
    }

    // 10. IllegalArgumentException
    private static void illegalArgumentExceptionExample() {
        System.out.println("\n10. IllegalArgumentException: Passing an invalid argument.");
        try {
            Thread thread = new Thread();
            thread.setPriority(20); // Priority must be between 1 and 10
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    // 11. NumberFormatException
    private static void numberFormatExceptionExample() {
        System.out.println("\n11. NumberFormatException: Converting a non-numeric string to a number.");
        try {
            int num = Integer.parseInt("invalid_number");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}

# Handling Exceptions

## Checked Exceptions

Checked exceptions are verified at compile time, meaning the code must handle them explicitly using try-catch blocks or declare them using throws.

1. IOException
   Example: Reading a non-existent file. This program tries to open a file that doesn’t exist, which throws an IOException. The catch block handles it.

2. FileNotFoundException
   Example: Trying to open a file that doesn’t exist. This is a specific type of IOException triggered when a file is not found.

3. EOFException
   Example: Reading beyond the file's content. This demonstrates reading past the content of a file, which throws an EOFException.

4. SQLException
   Example: Connecting to a non-existent database. This code simulates a database error by attempting to connect to a non-existent database.

5. ClassNotFoundException
   Example: Loading a missing class. This program tries to load a class that doesn't exist, throwing a ClassNotFoundException.

### Unchecked Exceptions

Unchecked exceptions occur at runtime and are not checked at compile time.

6. ArithmeticException
   Example: Division by zero. This code triggers an arithmetic error by dividing a number by zero.

7. NullPointerException
   Example: Accessing a null reference. Accessing a method on a null object reference throws a NullPointerException.

8. ArrayIndexOutOfBoundsException
   Example: Accessing an invalid index. Accessing an array index outside its bounds throws this exception.

9. ClassCastException
   Example: Invalid type casting. This demonstrates an invalid type cast at runtime.

10. IllegalArgumentException
    Example: Passing an invalid argument. Passing an invalid argument to a method throws an IllegalArgumentException.

11. NumberFormatException
    Example: Converting a non-numeric string to a number. This demonstrates converting an invalid string into a number.

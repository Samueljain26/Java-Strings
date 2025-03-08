# Java-Strings
1. Introduction to Strings
Strings are sequences of characters enclosed in double quotes ("").
They are commonly used to store and manipulate textual data in Java.

2. Creating Strings
Strings can be declared like other variables using the String datatype.
Example: "Hello World" is a valid string.

3. Escape Sequences in Strings
Special characters like double quotes (\"), new lines (\n), and tabs (\t) can be included using escape sequences.

4. Taking String Input
next() → Reads a single word until space is encountered.
nextLine() → Reads the entire line, including spaces.
trim() → Removes leading and trailing spaces.

5. String Arrays
Arrays of strings can store multiple string values.
Can be initialized during declaration or taken as user input.
Accessing string arrays can be done using loops.

6. Passing Strings as Method Parameters
Strings and string arrays can be passed as arguments to methods and returned as results.

7. Built-in String Methods
trim() → Removes spaces from the beginning and end.
length() → Returns the length of the string.
charAt(index) → Returns the character at a specified index.
concat() → Joins two strings.
equals() → Compares two strings for equality.
toLowerCase() / toUpperCase() → Converts string to lowercase or uppercase.
substring(begin, end) → Extracts part of the string from begin to end-1.

8. ASCII Character Codes
Each character has a corresponding numeric ASCII value.
Uppercase letters (A-Z) → 65 to 90, Lowercase letters (a-z) → 97 to 122.
The difference between uppercase and lowercase letters is 32.

9. Java Exceptions (Error Handling in Strings)
Unchecked Exceptions → Occur at runtime, like NullPointerException, ArrayIndexOutOfBoundsException.
Checked Exceptions → Must be handled using try-catch, like FileNotFoundException.
Using try-catch ensures the program does not crash unexpectedly.

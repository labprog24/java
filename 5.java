import java.util.Scanner;

public class StringOperations {
    public static String copyString(String source) {
        return source;
    }

    public static int getLength(String str) {
        return str.length();
    }

    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static char getCharAtIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        int index = 2;

        String copiedStr = copyString(str1);
        System.out.println("Copied String: " + copiedStr);

        int length = getLength(str1);
        System.out.println("Length of str1: " + length);

        String concatenatedStr = concatenateStrings(str1, str2);
        System.out.println("Concatenated String: " + concatenatedStr);

        int comparison = compareStrings(str1, str2);
        System.out.println("Comparison Result: " + comparison);

        try {
            char charAtIndex = getCharAtIndex(str1, index);
            System.out.println("Character at index " + index + ": " + charAtIndex);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


public class StringManipulation {

    public static void main(String[] args) {
        String str1 = "greet";
        String str2 = "thepeople";
        int length = 5;
        System.out.println("Middle substring: " + getMiddleSubstring(str1, str2, length));
    }
    public static String getMiddleSubstring(String str1, String str2, int length) {
        String concatenated = str1.concat(str2);
        String reversed = new StringBuilder(concatenated).reverse().toString();
        int startIndex = (reversed.length() - length) / 2;
        return reversed.substring(startIndex, startIndex + length);
    }
}

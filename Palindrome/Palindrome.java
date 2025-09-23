public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring((s.length() + 1) / 2);
        secondHalf = new StringBuilder(secondHalf).reverse().toString();
        return firstHalf.equals(secondHalf);
    }
}
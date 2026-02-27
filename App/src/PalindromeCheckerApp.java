public class PalindromeCheckerApp {
    public static boolean isPalindrome(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindrome(text, start + 1, end - 1);
    }
    public static void main(String[] args) {
        String inputText = "level";
        boolean result = isPalindrome(inputText, 0, inputText.length() - 1);

        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + result);
    }
}
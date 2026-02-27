public class PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String inputText = "A man a plan a canal Panama";
        boolean result = isPalindrome(inputText);

        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + result);
    }
}
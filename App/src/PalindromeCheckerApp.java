public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String inputText = "radar";
        char[] characters = inputText.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
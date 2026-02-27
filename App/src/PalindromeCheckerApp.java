import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String inputText = "madam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputText.length(); i++) {
            stack.push(inputText.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < inputText.length(); i++) {
            char poppedChar = stack.pop();

            if (inputText.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

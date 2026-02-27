import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String inputText = "racecar";
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < inputText.length(); i++) {
            deque.addLast(inputText.charAt(i));
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
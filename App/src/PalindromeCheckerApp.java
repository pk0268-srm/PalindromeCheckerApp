import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String inputText = "madam";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();   // Dequeue
            char fromStack = stack.pop();      // Pop
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
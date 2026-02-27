import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;
public class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean check(String text);
    }
    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean check(String text) {
            Stack<Character> stack = new Stack<>();
            for (char c : text.toCharArray()) {
                stack.push(c);
            }
            for (char c : text.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    }
    static class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean check(String text) {
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : text.toCharArray()) {
                deque.addLast(c);
            }
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }
            return true;
        }
    }
    static class PalindromeContext {
        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean executeStrategy(String text) {
            return strategy.check(text);
        }
    }
    public static void main(String[] args) {
        String inputText = "madam";
        PalindromeContext stackContext = new PalindromeContext(new StackStrategy());
        boolean resultStack = stackContext.executeStrategy(inputText);
        System.out.println("Using Stack Strategy:");
        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + resultStack);

        PalindromeContext dequeContext = new PalindromeContext(new DequeStrategy());
        boolean resultDeque = dequeContext.executeStrategy(inputText);
        System.out.println("Using Deque Strategy:");
        System.out.println("Input text: " + inputText);
        System.out.println("Is it a Palindrome? : " + resultDeque);
    }
}
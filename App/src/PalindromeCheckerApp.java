import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static boolean loopPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean recursivePalindrome(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return recursivePalindrome(text, start + 1, end - 1);
    }
    public static boolean stackPalindrome(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }
    public static boolean dequePalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String inputText = "A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase();
        long startTime, endTime;
        startTime = System.nanoTime();
        boolean loopResult = loopPalindrome(inputText);
        endTime = System.nanoTime();
        System.out.println("Loop Result: " + loopResult + " | Time (ns): " + (endTime - startTime));
        startTime = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(inputText, 0, inputText.length() - 1);
        endTime = System.nanoTime();
        System.out.println("Recursive Result: " + recursiveResult + " | Time (ns): " + (endTime - startTime));
        startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(inputText);
        endTime = System.nanoTime();
        System.out.println("Stack Result: " + stackResult + " | Time (ns): " + (endTime - startTime));
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(inputText);
        endTime = System.nanoTime();
        System.out.println("Deque Result: " + dequeResult + " | Time (ns): " + (endTime - startTime));
    }
}
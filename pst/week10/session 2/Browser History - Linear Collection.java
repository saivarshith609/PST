import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("Wikipedia");

        System.out.println("Current Page: " + history.peek());

        System.out.println("Back to: " + history.pop());
        System.out.println("Back to: " + history.pop());

        System.out.println("Current Page: " + history.peek());
    }
}
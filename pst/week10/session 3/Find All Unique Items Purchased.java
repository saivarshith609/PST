import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> items = new LinkedHashSet<>();

        items.add("Laptop");
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Mouse");
        items.add("Laptop");
        items.add("Headphones");

        System.out.println("Unique Items Purchased:");

        for (String item : items) {
            System.out.println(item);
        }
    }
}\
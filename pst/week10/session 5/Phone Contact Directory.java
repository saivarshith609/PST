import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Alice", "9876543210");
        contacts.put("Bob", "9123456780");
        contacts.put("Charlie", "9988776655");

        String searchName = "Bob";

        if (contacts.containsKey(searchName)) {
            System.out.println("Phone Number: "
                    + contacts.get(searchName));
        } else {
            System.out.println("Contact Not Found");
        }

        contacts.put("Bob", "9000011111");

        System.out.println("\nUpdated Contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() +
                    " - " + entry.getValue());
        }
    }
}
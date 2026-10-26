import java.util.*;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Order implements Comparable<Order> {
    int orderId;
    int priority;

    Order(int orderId, int priority) {
        this.orderId = orderId;
        this.priority = priority;
    }

    @Override
    public int compareTo(Order o) {
        return o.priority - this.priority;
    }
}

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Product> products = new HashMap<>();

        products.put(101, new Product(101, "Laptop"));
        products.put(102, new Product(102, "Mobile"));

        int searchId = 101;

        if (products.containsKey(searchId)) {
            System.out.println("Product Found: "
                    + products.get(searchId).name);
        }

        PriorityQueue<Order> pq = new PriorityQueue<>();

        pq.add(new Order(1, 3));
        pq.add(new Order(2, 1));
        pq.add(new Order(3, 5));

        while (!pq.isEmpty()) {
            System.out.println("Processing Order "
                    + pq.poll().orderId);
        }
    }
}
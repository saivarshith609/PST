import java.util.*;

class Product {

    int id;
    String name;
    int stock;
    double price;

    Product(int id,
            String name,
            int stock,
            double price) {

        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Product>
                map = new HashMap<>();

        map.put(1,
                new Product(
                        1,
                        "Rice",
                        50,
                        100));

        map.put(2,
                new Product(
                        2,
                        "Sugar",
                        10,
                        45));

        map.put(3,
                new Product(
                        3,
                        "Milk",
                        5,
                        30));

        map.get(1).stock -= 5;

        int threshold = 15;

        System.out.println(
                "Low Stock Products");

        for (Product p :
                map.values()) {

            if (p.stock < threshold)
                System.out.println(
                        p.name + " "
                                + p.stock);
        }

        List<Product> products =
                new ArrayList<>(
                        map.values());

        products.sort(
                Comparator.comparingInt(
                        p -> p.stock));

        System.out.println(
                "Sorted by Stock");

        for (Product p :
                products) {

            System.out.println(
                    p.name + " "
                            + p.stock);
        }

        Product p = map.get(2);

        System.out.println(
                "Retrieved: "
                        + p.name);
    }
}
import java.util.*;

abstract class Vehicle {
    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {
    public int calculateFare(int distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    public int calculateFare(int distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    public int calculateFare(int distance) {
        return distance * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            try {
                if (distance <= 0) {
                    throw new IllegalArgumentException();
                }

                Vehicle vehicle;

                switch (type) {
                    case "Bike":
                        vehicle = new Bike();
                        break;
                    case "Auto":
                        vehicle = new Auto();
                        break;
                    case "Cab":
                        vehicle = new Cab();
                        break;
                    default:
                        throw new IllegalArgumentException();
                }

                System.out.println(vehicle.calculateFare(distance));

            } catch (Exception e) {
                System.out.println("Invalid Booking");
            }
        }

        sc.close();
    }
}
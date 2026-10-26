import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> marks = new ArrayList<>();

        int highest = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();
            marks.add(mark);

            if (mark > highest) {
                highest = mark;
            }

            sum += mark;
        }

        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        double average = (double) sum / n;

        System.out.println("Highest Mark: " + highest);
        System.out.printf("Average: %.2f%n", average);

        sc.close();
    }
}
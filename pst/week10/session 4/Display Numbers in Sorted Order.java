import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(92);
        marks.add(85);
        marks.add(67);

        System.out.println("Unique Marks in Ascending Order:");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
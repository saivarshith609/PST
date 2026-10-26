import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> student1 = new ArrayList<>();
        student1.add("Math");
        student1.add("Physics");
        student1.add("Chemistry");
        student1.add("English");

        ArrayList<String> student2 = new ArrayList<>();
        student2.add("Physics");
        student2.add("ComputerScience");
        student2.add("English");
        student2.add("Biology");

        student1.retainAll(student2);

        System.out.println("Common Subjects:");
        for (String subject : student1) {
            System.out.println(subject);
        }
    }
}
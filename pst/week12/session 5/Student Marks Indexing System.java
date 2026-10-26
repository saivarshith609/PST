import java.util.*;

class Student {

    int id;
    String name;
    double marks;

    Student(int id,
            String name,
            double marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Student>
                students =
                new HashMap<>();

        students.put(
                101,
                new Student(
                        101,
                        "Alice",
                        92));

        students.put(
                102,
                new Student(
                        102,
                        "Bob",
                        85));

        int searchId = 101;

        if (students.containsKey(
                searchId)) {

            Student s =
                    students.get(
                            searchId);

            System.out.println(
                    s.name + " "
                            + s.marks);
        }
    }
}
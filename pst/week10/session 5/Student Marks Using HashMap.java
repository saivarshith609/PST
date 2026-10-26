import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> studentMarks = new HashMap<>();

        studentMarks.put(101, 85);
        studentMarks.put(102, 92);
        studentMarks.put(103, 78);
        studentMarks.put(104, 88);

        int searchRollNo = 102;

        if (studentMarks.containsKey(searchRollNo)) {
            System.out.println("Marks: " + studentMarks.get(searchRollNo));
        } else {
            System.out.println("Student not found");
        }
    }
}
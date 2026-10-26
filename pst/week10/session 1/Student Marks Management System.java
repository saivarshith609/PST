import java.util.Scanner;

class DynamicMarksArray {
    private int[] marks;
    private int size;

    public DynamicMarksArray() {
        marks = new int[2];
        size = 0;
    }

    public void addMark(int mark) {
        if (size == marks.length) {
            int[] newMarks = new int[marks.length * 2];

            for (int i = 0; i < marks.length; i++) {
                newMarks[i] = marks[i];
            }

            marks = newMarks;
        }

        marks[size++] = mark;
    }

    public void displayMarks() {
        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        DynamicMarksArray students = new DynamicMarksArray();

        for (int i = 0; i < n; i++) {
            students.addMark(sc.nextInt());
        }

        students.displayMarks();
        sc.close();
    }
}
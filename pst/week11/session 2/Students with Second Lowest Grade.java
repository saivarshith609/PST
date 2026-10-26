import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        TreeSet<Double> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double grade = sc.nextDouble();
            sc.nextLine();

            names.add(name);
            grades.add(grade);
            set.add(grade);
        }

        ArrayList<Double> sortedGrades =
                new ArrayList<>(set);

        double secondLowest = sortedGrades.get(1);

        ArrayList<String> result =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (grades.get(i) == secondLowest)
                result.add(names.get(i));
        }

        Collections.sort(result);

        for (String name : result)
            System.out.println(name);
    }
}
import java.util.*;

public class Main {

    public static int migratoryBirds(List<Integer> arr) {

        int[] freq = new int[6];

        for (int id : arr) {
            freq[id]++;
        }

        int max = 0;
        int answer = 0;

        for (int i = 1; i <= 5; i++) {

            if (freq[i] > max) {
                max = freq[i];
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(
                migratoryBirds(arr));
    }
}
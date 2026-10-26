import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        HashMap<Integer, Integer> freq =
                new HashMap<>();

        HashMap<Integer, Integer> countFreq =
                new HashMap<>();

        while (q-- > 0) {

            int op = sc.nextInt();
            int val = sc.nextInt();

            if (op == 1) {

                int oldFreq =
                        freq.getOrDefault(val, 0);

                int newFreq = oldFreq + 1;

                freq.put(val, newFreq);

                countFreq.put(oldFreq,
                        countFreq.getOrDefault(
                                oldFreq, 0) - 1);

                countFreq.put(newFreq,
                        countFreq.getOrDefault(
                                newFreq, 0) + 1);

            } else if (op == 2) {

                if (freq.containsKey(val)
                        && freq.get(val) > 0) {

                    int oldFreq =
                            freq.get(val);

                    int newFreq =
                            oldFreq - 1;

                    freq.put(val, newFreq);

                    countFreq.put(oldFreq,
                            countFreq.get(oldFreq)
                                    - 1);

                    countFreq.put(newFreq,
                            countFreq.getOrDefault(
                                    newFreq, 0) + 1);
                }

            } else {

                if (countFreq.getOrDefault(
                        val, 0) > 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}
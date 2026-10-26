import java.util.*;

public class Main {

    public static int maxDistinct(int[] arr,
                                  int k) {

        HashMap<Integer, Integer> map =
                new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i],
                    map.getOrDefault(
                            arr[i], 0) + 1);
        }

        int max = map.size();

        for (int i = k; i < arr.length; i++) {

            int remove = arr[i - k];

            map.put(remove,
                    map.get(remove) - 1);

            if (map.get(remove) == 0)
                map.remove(remove);

            map.put(arr[i],
                    map.getOrDefault(
                            arr[i], 0) + 1);

            max = Math.max(max,
                    map.size());
        }

        return max;
    }
}
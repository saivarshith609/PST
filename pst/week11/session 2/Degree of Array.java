import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {

            first.putIfAbsent(nums[i], i);

            count.put(nums[i],
                    count.getOrDefault(nums[i], 0) + 1);

            int freq = count.get(nums[i]);

            if (freq > degree) {
                degree = freq;
                minLen = i - first.get(nums[i]) + 1;
            } else if (freq == degree) {
                minLen = Math.min(minLen,
                        i - first.get(nums[i]) + 1);
            }
        }

        return minLen;
    }
}
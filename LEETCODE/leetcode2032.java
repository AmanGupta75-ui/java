package LEETCODE;
class Solution {
    private void updateCounts(int[] nums, int[] counts) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int n : nums) {
            if (uniqueValues.add(n)) {
                counts[n]++;
            }
        }
    }
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] counts = new int[101];

        updateCounts(nums1, counts);
        updateCounts(nums2, counts);
        updateCounts(nums3, counts);

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (counts[i] >= 2) {
                result.add(i);
            }
        }

        return result;


    }
}

public class leetcode2032 {
}

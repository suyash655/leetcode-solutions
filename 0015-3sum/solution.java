import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            Map<Integer, Integer> map = new HashMap<>();
            int target = 0 - nums[i];

            for (int j = i + 1; j < nums.length; j++) { // was j=0
                int diff = target - nums[j];

                if (map.containsKey(diff)) {
                    List<Integer> triplet = List.of(nums[i], diff, nums[j]);
                    if (seen.add(triplet)) { // skip duplicate triplets
                        list.add(triplet);
                    }
                }
                map.put(nums[j], j);
            }
        }
        return list;
    }
}   

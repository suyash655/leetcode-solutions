class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        
        if (nums.length < 3) {
            return new ArrayList<>(result);
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -nums[i] - nums[j];
                
                if (map.containsKey(complement)) {
                    // Create sorted triplet to ensure uniqueness in Set
                    List<Integer> triplet = Arrays.asList(nums[i], complement, nums[j]);
                    result.add(triplet);
                }
                
                // Only add current element to map after checking for complement
                // This ensures we don't use the same element twice
                map.put(nums[j], j);
            }
        }
        
        return new ArrayList<>(result);
    }
}   

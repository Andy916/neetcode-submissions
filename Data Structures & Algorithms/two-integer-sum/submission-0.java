class Solution {
    public int[] twoSum(int[] nums, int target) {
        // number, index
        HashMap<Integer, Integer> map = new HashMap<>();
        // keep track of the compliment for each number, once you find the compliment, that's the answer
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}

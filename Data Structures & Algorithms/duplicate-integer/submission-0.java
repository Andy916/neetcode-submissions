class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set = new HashSet<>();
        boolean result = false;
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            }
            else {
                result = true;
            }
        }
        return result;
    }
}
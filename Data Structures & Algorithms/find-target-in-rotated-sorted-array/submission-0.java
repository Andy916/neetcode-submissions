class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;

            // check if right is sorted
            if (nums[mid] < nums[end]) {
                // check if target is in that sorted right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; 
                } else {
                    end = mid - 1;
                }
            } 
            // if not right, then left
            else {
                // check if target is in sorted left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

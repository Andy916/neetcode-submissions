class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int currentMax = 0;
        int currentArea;
        while (left < right) {
            currentArea = (right - left) * Math.min(heights[left], heights[right]);
            if (currentArea > currentMax) {
                currentMax = currentArea;
            }

            if (heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return currentMax;
    }
}

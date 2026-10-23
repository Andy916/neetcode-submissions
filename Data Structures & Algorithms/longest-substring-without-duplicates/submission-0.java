class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> windowSet = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            while (windowSet.contains(currentChar)) {
                windowSet.remove(s.charAt(left));
                left++;
            }
            
            windowSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
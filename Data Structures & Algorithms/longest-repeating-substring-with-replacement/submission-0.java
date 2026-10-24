class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> counts = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        int maxFrequency = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            counts.put(currentChar, counts.getOrDefault(currentChar, 0) + 1);
            
            maxFrequency = Math.max(maxFrequency, counts.get(currentChar));
            
            while ((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                counts.put(leftChar, counts.get(leftChar) - 1);
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
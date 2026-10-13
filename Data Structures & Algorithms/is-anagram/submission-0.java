class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies from string s
        for (char letter : s.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        // Subtract frequencies using string t
        for (char letter : t.toCharArray()) {
            if (!map.containsKey(letter)) {
                return false;
            }
            map.put(letter, map.get(letter) - 1);
        }

        // Check if all frequencies are zero
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
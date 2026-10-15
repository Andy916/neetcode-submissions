public class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            // delimiter #
            while (str.charAt(j) != '#') {
                j++;
            }
            // find length of current string
            int length = Integer.parseInt(str.substring(i, j));
            // extract
            String s = str.substring(j + 1, j + 1 + length);
            res.add(s);
            // move pointer to next string
            i = j + 1 + length;
        }
        return res;
    }
}
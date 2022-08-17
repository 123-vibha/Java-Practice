class Solution {
    public int lengthOfLongestSubstring(String s) {
        var counts = new int[128];
        int result = -1, start = 0, end = 0;
        for(; end < s.length(); ++end) {
            for(; counts[s.charAt(end)] > 0; ++start) {
                counts[s.charAt(start)] = 0;
            }
            counts[s.charAt(end)] = end + 1;
            if(result < end - start) {
                result = end - start;
            }
        }
        if(result < 0) {
            return 0;
        }
        return result + 1;
    }
}
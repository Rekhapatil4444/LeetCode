class Solution {
    // Now this checks substring haystack[l..r] against needle
    public boolean isPossible(String haystack, int l, int r, String needle) {
        if (r - l + 1 != needle.length()) {
            return false;
        }
        for (int i = 0; i < needle.length(); i++) {
            if (haystack.charAt(l + i) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        int m = haystack.length();
        int n = needle.length();
        if (n == 0) {
            return 0;
        }
        if (m < n) {
            return -1;
        }
        int ans = -1;
        int l = 0;
        // sliding window: r is the right end
        for (int r = 0; r < haystack.length(); r++) {
            // keep window size at most n
            if (r - l + 1 > n) {
                l++;
            }
            // if the window is exactly size n, test it
            if (r - l + 1 == n) {
                if (isPossible(haystack, l, r, needle)) {
                    ans = l;
                    break;
                }
            }
        }
        return ans;
    }

    // You can include a main to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.strStr("sadbutsad", "sad"));  // expected 0
        System.out.println(sol.strStr("leetcode", "leeto")); // expected -1
    }
}

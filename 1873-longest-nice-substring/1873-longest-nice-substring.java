import java.util.*;

class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String best = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isNice(sub)) {
                    if (sub.length() > best.length()) {
                        best = sub;
                    }
                }
            }
        }
        return best;
    }

    private boolean isNice(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c : set) {
            char toggled = Character.isLowerCase(c) ?
                            Character.toUpperCase(c) :
                            Character.toLowerCase(c);
            if (!set.contains(toggled)) {
                return false;
            }
        }
        return true;
    }
}




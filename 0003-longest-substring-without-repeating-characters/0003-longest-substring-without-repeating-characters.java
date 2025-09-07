import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hr=new HashSet<>();
        int n=s.length();
        int l=0;
        int ans=0;
        for(int r=0;r<n;r++)
        {
            char ch=s.charAt(r);
            while(hr.contains(ch)){
                hr.remove(s.charAt(l));
                l++;
            }
            hr.add(ch);
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
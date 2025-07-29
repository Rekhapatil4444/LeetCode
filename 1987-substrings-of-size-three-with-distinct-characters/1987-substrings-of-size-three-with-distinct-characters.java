class Solution {
       public int countGoodSubstrings(String s) {
        HashMap<Character,Integer>hr=new HashMap<>();
        int ans=0;
        int n=s.length();
        int k=3;
        int l=0;
        for(int r=0;r<s.length();r++)
        {
           char tch=s.charAt(r);
           hr.put(tch,hr.getOrDefault(tch,0)+1);
           if(r-l==k){
            char ch=s.charAt(l);
            hr.put(ch,hr.get(ch)-1);
            if(hr.get(ch)==0){
                hr.remove(ch);
            }
            l++;
           }
            if(hr.size()==k){
                ans=ans+1;
            }
           }
           return ans;
          }
}
        
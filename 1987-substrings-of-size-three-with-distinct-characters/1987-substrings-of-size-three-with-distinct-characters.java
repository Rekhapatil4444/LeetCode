class Solution {
    public static boolean fun(String s,int k){
        HashSet<Character>hr=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hr.add(ch);
        }
        if(hr.size()==k){
            return true;
        }
        else{
            return false;
        }
    }

    public int countGoodSubstrings(String s) {
        int ans=0;
        int n=s.length();
        int k=3;
        for(int i=0;i<n-k+1;i++)
        {
           boolean temp=fun(s.substring(i,i+k),k);
        if(temp){
            ans=ans+1;
        }
        }
        return ans;
        }
    }
        
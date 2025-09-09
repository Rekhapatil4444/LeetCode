class Solution {
    public boolean fun(HashMap<Character,Integer>hms,HashMap<Character,Integer>hmp)
    {
        if(hms.size()!=hmp.size())
        {
            return false;
        }
        for(char i:hmp.keySet()){
            if(!hms.containsKey(i))
            {
                return false;
            }
            int a=hmp.get(i);
            int b=hms.get(i);
            if(a!=b){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer>hms=new HashMap<>();
        HashMap<Character,Integer>hmp=new HashMap<>();
        for(int j=0;j<p.length();j++){
            char ch=p.charAt(j);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        int k=p.length();
        int n=s.length();
        int l=0;
        for(int r=0;r<n;r++){
            char ch1=s.charAt(r);
           hms.put(ch1,hms.getOrDefault(ch1,0)+1);
           if(r-l==k){
            char ch2=s.charAt(l);
            hms.put(ch2,hms.get(ch2)-1);
            if(hms.get(ch2)==0){
                hms.remove(ch2);
            }
              l++;
           }
           if(r-l+1==k){
            boolean valid=fun(hms,hmp);
            if(valid){
                ans.add(l);
            }
           }
          }
          return ans;
    }
}
        

    
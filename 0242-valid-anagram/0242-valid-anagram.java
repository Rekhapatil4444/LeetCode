class Solution {
    public static boolean fun(HashMap<Character,Integer>hr,HashMap<Character,Integer>rh)
    {
        if(hr.size()!=rh.size())
        {
            return false;
        }
        for(char key:hr.keySet())
        {
            if(!rh.containsKey(key))
            {
                return false;
            }
        int a=hr.get(key);
        int b=rh.get(key);
        if(a!=b)
        {
            return false;
        }
      
      } 
    return true;  
    }
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer>hr=new HashMap<>();   
      HashMap<Character,Integer>rh=new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
        char ch1=s.charAt(i);
        hr.put(ch1,hr.getOrDefault(ch1,0)+1);
      }
        for(int i=0;i<t.length();i++)
      {
        char ch2=t.charAt(i);
        rh.put(ch2,rh.getOrDefault(ch2,0)+1);
        
      }
       return fun(hr,rh);
    }
}
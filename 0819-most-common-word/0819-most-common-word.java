class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
     paragraph=paragraph.toLowerCase();
     paragraph=paragraph.replaceAll("[^a-z]"," ");
     String []words=paragraph.split(" ");
     Set<String> ban=new HashSet<>();
     for(String b:banned)
     {
        ban.add(b);
     }
     HashMap<String,Integer> hr=new HashMap<>();
     for(String word:words)
     {
        if(word.length()>0 && !ban.contains(word))
        {
            hr.put(word,hr.getOrDefault(word,0)+1);
        }  
     }
     String result="";
     int max=0;
     for(String word:hr.keySet())
     {
        if(hr.get(word)>max)
        {
            max=hr.get(word);
            result=word;
        }
     }
     return result;
    }
}
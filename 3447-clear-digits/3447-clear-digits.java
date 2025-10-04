class Solution {
    public String clearDigits(String s) {
        Stack<Character>hr=new Stack<>();
        String h="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                hr.pop();
            }
            else{
                hr.push(ch);
            }
        }
           StringBuilder st=new StringBuilder();
         while(!hr.isEmpty()){
            st.append(hr.pop());
         }
         st.reverse();
           return st.toString();
        }
}
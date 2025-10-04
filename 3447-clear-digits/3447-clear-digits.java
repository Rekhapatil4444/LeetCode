class Solution {
    public String clearDigits(String s) {
        Stack<Character>hr=new Stack<>();
        String h="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                hr.pop();
            }
            else{
                hr.push(ch);
            }
        }
           StringBuilder st=new StringBuilder();
           for(Character c:hr){
            st.append(c);
           }
           return st.toString();
        }
}
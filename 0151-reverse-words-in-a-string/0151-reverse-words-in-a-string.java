class Solution {
    Stack<String>st=new Stack<>();
    StringBuilder word=new StringBuilder();
    public String reverseWords(String s) {
        for(int i=0;i<s.length();i++)
        {
            Character ch=s.charAt(i);
            if(ch!=' ')
            {
                word.append(ch);
            }
            else{
                if(word.length()>0)
                {
                    st.push(word.toString());
                    word.setLength(0);
                }
            }
        }
        if(word.length()>0)
        {
            st.push(word.toString());
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.pop());
            if(!st.empty())
            {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
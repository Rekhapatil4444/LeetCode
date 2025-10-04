class Solution {
    public boolean isValid(String s) {
        Stack<Character>hr=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
             if(ch1=='('||ch1=='['||ch1=='{'){
                hr.push(ch1);
             }
             else{
                if(!hr.isEmpty() && ((ch1==')' && hr.peek()=='(')
                ||(ch1==']' && hr.peek()=='[')||
                (ch1=='}'&&hr.peek()=='{')))
                {
                    hr.pop();
                }
                else{
                    return false;
                }
             }
        }
             return hr.isEmpty();
    }
}

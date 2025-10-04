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
            
                if(hr.isEmpty())
                {
                    return false;
                }
                    int top=hr.pop();
                if(ch1==')'&&top!='('||ch1==']'&&top!='['||ch1=='}'&&top!='{'){
                    return false;
                }
             }
        }
             if(hr.isEmpty()){
               return true;
             }
             else{
                return false;
             }
        }
}

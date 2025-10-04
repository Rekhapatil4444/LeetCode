class Solution {
    public int maxDepth(String s) {
        Stack<Character>hr=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
              hr.push(c);
            }
            else if(c==')'){
                hr.pop();
            }
           ans=Math.max(ans,hr.size());   
        }
        return ans;
    }
}
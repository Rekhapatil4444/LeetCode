class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>hr=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("+")){
                int top=hr.pop();
                int sec=hr.peek();
                int fa=top+sec;
                hr.push(top);
                hr.push(fa);
            }
            else if(s.equals("D")){
                hr.push(hr.peek()*2);
            }
            else if(s.equals("C")){
                hr.pop();
            }
            else{
                hr.push(Integer.parseInt(s));
            }
        }
        int tsum=0;
        for(int i:hr){
            tsum+=i;
        }
        return tsum;
    }
}

       
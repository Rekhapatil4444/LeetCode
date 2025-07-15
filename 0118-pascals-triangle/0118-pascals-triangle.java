class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>hr=new ArrayList<>();
        List<Integer>firstrow=new ArrayList<>();
        firstrow.add(1);
        hr.add(firstrow);
        for(int i=1;i<numRows;i++){
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++)
            {
                int val=hr.get(i-1).get(j)+hr.get(i-1).get(j-1);
                temp.add(val);
            }
           temp.add(1);
           hr.add(temp);

        }
        return hr;

        
        
    }
}
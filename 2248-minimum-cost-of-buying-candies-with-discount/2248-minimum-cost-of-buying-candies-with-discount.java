class Solution {
    public int minimumCost(int[] cost) 
    {
        int took=0;
        int ans=0;
        Arrays.sort(cost);
        int n=cost.length;
        for(int i=n-1;i>=0;i--)
        {
            if(took==2){
                took=0;
            }
            else{
                 ans=ans+cost[i];
                 took++;
            }

        }
        return ans;
    }
}
    
           
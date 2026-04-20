class Solution {
    public int maxDistance(int[] colors) {
           int max=-1;
        int n=colors.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(colors[i]!=colors[j])
                {
                    int temp=Math.abs(i-j);
                    if(temp>max)
                    {
                        max=temp;
                    }
                }
            }
        }
        return max;
        }
}
    
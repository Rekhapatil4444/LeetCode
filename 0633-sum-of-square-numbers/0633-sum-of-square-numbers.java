class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0;
        long right=(long)Math.sqrt(c);
        boolean ans=false;
        while(left<=right)
        {
            long sum=left*left+right*right;
            if(sum==c)
            {
                return ans=true;
            }
            else if(sum<c)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return ans;
    }
}
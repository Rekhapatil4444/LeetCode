class Solution {
    public boolean isPossible(int[] candies, long k,int mid) {
        for(int i=0;i<candies.length;i++){
            int temp=candies[i]/mid;
            k-=temp;
            if(k<=0){
                return true;
            }
        }
            return false;
        }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=Integer.MAX_VALUE;
        while(l<=r){
             int mid=l+(r-l)/2;
            if(isPossible(candies,k,mid)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return r;
    }
}
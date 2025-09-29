class Solution {
    public  boolean small(int []nums,int threshold,int k){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            int upper=nums[i]/k;
            if(nums[i]%k!=0){
                upper++;
            }
            temp+=upper;
            if(temp>threshold){
                return false;
            }
            
        }
        return true;
        
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=1000000;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(small(nums,threshold,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
        
    }
}
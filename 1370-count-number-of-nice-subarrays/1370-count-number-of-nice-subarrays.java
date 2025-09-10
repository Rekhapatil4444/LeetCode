class Solution {
    public int atMostk(int []nums,int k){
        int n=nums.length;
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if(nums[r]%2==1){
                temp++;
            }
            while(temp>k){
                if(nums[l]%2==1){
                    temp--;
                }
                l++;
            }
           
         ans=ans+r-l+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       int fans=atMostk(nums,k)-atMostk(nums,k-1);
       return fans;
    }
}

    
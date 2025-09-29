class Solution {
    public boolean isSplit(int []nums,int k,int mid){
        int took=0;
         k-=1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val>mid)
            {
                return false;
            }
            if(took+val>mid){
                k-=1;
                took=0;
            }
            took+=val;
            if(k<0){
                return  false;
            }
        }
        return true;
    }
        
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isSplit(nums,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
                    }
    }

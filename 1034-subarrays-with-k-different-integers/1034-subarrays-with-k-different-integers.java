class Solution {
    public int atMostk(int nums[],int k){
        HashMap<Integer,Integer>hr=new HashMap<>();
         int l=0;
        int ans=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            int val=nums[r];
            hr.put(val,hr.getOrDefault(val,0)+1);
            while(hr.size()>k){
                int val2=nums[l];
                hr.put(val2,hr.getOrDefault(val2,0)-1);
                if(hr.get(val2)==0){
                    hr.remove(val2);
                }
                l++;
            }
            ans=ans+r-l+1;
     }
     return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostk( nums, k)-atMostk(nums,k-1);
    }
}
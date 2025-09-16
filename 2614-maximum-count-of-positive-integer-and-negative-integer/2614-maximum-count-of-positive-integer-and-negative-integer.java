class Solution {
    public int maximumCount(int[] nums) {
        ArrayList<Integer>hr=new ArrayList<>();
      int ans=0;
      int k=0;
      int p=0;
      int c=0;
      for(int i=0;i<nums.length;i++){
        int n=nums[i];
        if(n==0){
             c=0;
        }
        else if(n<0){
            k++;
        }
        else{
            p++;
        }
        ans=Math.max(k,p);
      }
      return ans;
    }
}
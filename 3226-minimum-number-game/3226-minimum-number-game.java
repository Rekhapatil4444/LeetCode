class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2)
        {
            int j=i+1;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

        }
        return nums;
        
    }
}
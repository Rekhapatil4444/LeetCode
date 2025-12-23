class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>hr=new HashMap<>();
        {
            for(int i=0;i<nums.length;i++)
            {
                if(hr.containsKey(nums[i])&& i-hr.get(nums[i])<=k)
                {
                    return true;
                }
                hr.put(nums[i],i);
            }
            return false;
        }
    }
}
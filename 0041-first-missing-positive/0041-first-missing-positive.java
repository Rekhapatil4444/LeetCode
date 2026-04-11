class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hr= new HashSet<>();
        for(int num:nums)
        {
            hr.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!hr.contains(i))
            {
                return i;
            }
        }
        return nums.length+1;
    }
}
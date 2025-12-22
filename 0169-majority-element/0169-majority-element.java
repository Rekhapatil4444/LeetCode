class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hr=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i];
            hr.put(a,hr.getOrDefault(a,0)+1);
        }
        int result=0;
        for(int k:hr.keySet())
        {
            if(hr.get(k)>n/2)
            {
                result=k;
            }
        }
        return result;
    }
}
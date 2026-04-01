class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> rh=new ArrayList<>();
        HashMap<Integer,Integer> hr =new  HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int ele=nums[i];
            hr.put(ele,hr.getOrDefault(ele,0)+1);
        } 
        for(int pr:hr.keySet())
        {
            if(hr.get(pr)>n/3)
            {
                rh.add(pr);
            }
        }
        return rh;
    }
}
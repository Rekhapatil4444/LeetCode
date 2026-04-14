class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> hr=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
             int n=nums[i];
             hr.put(n,hr.getOrDefault(n,0)+1);
       } 
       for(int ele:hr.keySet())
       {
           if(hr.get(ele)==1)
           {
            return ele;
           }
       }
       return -1;
    }
}
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> hr=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int ele=nums[i];
            if(ele%2==0){
                hr.put(ele,hr.getOrDefault(ele,0)+1);
            }
    
        }
        int max=0;
        int result=-1;
        for(int key:hr.keySet())
        {
            int temp=hr.get(key);
            if(temp>max)
            {
                max=temp;
                result=key;
            }else if(temp==max && key<result)
            {
                result=key;
            }
        }
        return result;
    }
        
}
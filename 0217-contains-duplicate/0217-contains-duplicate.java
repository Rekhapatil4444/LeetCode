class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>hr=new HashMap<>();
        {
            int l=0;
               boolean ans=false;
            for(int r=0;r<nums.length;r++){
                int n=nums[r];
                hr.put(n,hr.getOrDefault(n,0)+1);
            }
            for(int ele:hr.keySet()){
                if(hr.get(ele)>1){
                    ans= true;
                }
            }
        return ans;
        }
        
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>hr=new ArrayList<>();
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++)
            if(nums[i]+nums[j]==target){
                hr.add(i);
                hr.add(j);
                break;
            }
        }
        int arr[]=new int[hr.size()];
        for(int j=0;j<hr.size();j++){
                 arr[j]=hr.get(j);
        }
        return arr;
    }
}
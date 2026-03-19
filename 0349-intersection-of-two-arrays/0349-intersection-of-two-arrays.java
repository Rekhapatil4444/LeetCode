class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hr=new HashSet<>();
           HashSet<Integer>rh=new HashSet<>();
           for(int num:nums1)
           {
             hr.add(num);
           }
           for(int nums:nums2)
           {
            if(hr.contains(nums))
            {
                rh.add(nums);
            }
           }

        int arr[]=new int[rh.size()];
        int i=0;
        for(int num:rh)

        {
            arr[i++]=num;
        }
        return arr;
    }
}
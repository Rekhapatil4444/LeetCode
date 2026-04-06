class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
 int[] merged = new int[nums1.length + nums2.length];

        int k = 0;

        // copy nums1
        for (int x : nums1) {
            merged[k++] = x;
        }

        
        for (int x : nums2) {
            merged[k++] = x;
        }

        // sort
        Arrays.sort(merged);

        int n = merged.length;

    
        if (n % 2 == 0) {
            return (merged[n/2 - 1] + merged[n/2]) / 2.0;
        } else {
            return merged[n/2];
        }
    }
}

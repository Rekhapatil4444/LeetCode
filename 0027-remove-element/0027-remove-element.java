class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;  // Pointer to track the position for non-val elements

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  // Place non-val element at the current k position
                k++;  // Move the pointer forward
            }
        }

        // Optional: Print the modified array up to the k-th element
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return k;  // Return the count of non-val elements
    }
}


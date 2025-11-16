class Solution {

    // Function to merge nums2 into nums1
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;         // nums1 ka last valid index
        int j = n - 1;         // nums2 ka last index
        int k = m + n - 1;     // nums1 ka overall last index

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    // MAIN METHOD (Program starts here)
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};

        int m = 3;
        int n = 3;

        s.merge(nums1, m, nums2, n);

        // Print output
        System.out.print("Merged Array: ");
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }
}

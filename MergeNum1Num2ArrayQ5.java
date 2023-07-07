package in.ineuronAsignment1;

import java.util.Arrays;

public class MergeNum1Num2ArrayQ5 {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Index of last element in nums1
        int j = n - 1; // Index of last element in nums2
        int k = m + n - 1; // Index of last element in the merged array
        
        // Merge from the end of the arrays
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
        
        // Copy remaining elements from nums2 to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

	public static void main(String[] args) {
		// Question 5
		
		int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        MergeNum1Num2ArrayQ5 solution = new MergeNum1Num2ArrayQ5();
        solution.merge(nums1, m, nums2, n);

        System.out.println("Output after merging : " + Arrays.toString(nums1));

	}

}

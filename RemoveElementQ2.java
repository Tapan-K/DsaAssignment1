package in.ineuronAsignment1;

public class RemoveElementQ2 {
	
	public int removeElement(int[] nums, int val) {
        int k = 0; // variable to store the count of elements not equal to val.
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // overwrite the element at index k with the element at index i
                k++; 
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        RemoveElementQ2 solution = new RemoveElementQ2();
        int k = solution.removeElement(nums, val);

        System.out.print("Output: " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i != k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}


// Output :
// Output: 2, nums = [2, 2]

package in.ineuronAsignment1;

public class MoveZeroQ7 {

	public void moveZeroes(int[] nums) {
		int i = 0; // Index to keep track of non-zero elements

		for (int num : nums) {
			if (num != 0) {
				nums[i] = num;
				i++;
			}
		}

		// Fill the remaining elements with zeros
		while (i < nums.length) {
			nums[i] = 0;
			i++;
		}
	}

	public static void main(String[] args) {
		// Question 7

		int[] nums = { 0, 1, 0, 3, 12 };

		MoveZeroQ7 solution = new MoveZeroQ7();
		solution.moveZeroes(nums);

		System.out.print("Output: [");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i != nums.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

	}

}

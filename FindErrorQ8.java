package in.ineuronAsignment1;

import java.util.Arrays;

public class FindErrorQ8 {

	public int[] findErrorNums(int[] nums) {
		int[] result = new int[2];
		int n = nums.length;
		int[] count = new int[n + 1];

		// Count the occurrences of each number in the array
		for (int num : nums) {
			count[num]++;
		}

		// Find the number that occurs twice
		for (int i = 1; i <= n; i++) {
			if (count[i] == 2) {
				result[0] = i;
				break;
			}
		}

		// Find the number that is missing
		for (int i = 1; i <= n; i++) {
			if (count[i] == 0) {
				result[1] = i;
				break;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 4 };

		FindErrorQ8 solution = new FindErrorQ8();
		int[] result = solution.findErrorNums(nums);

		System.out.println("Output: " + Arrays.toString(result));

	}

}

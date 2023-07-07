package in.ineuronAsignment1;

import java.util.Arrays;

public class IncrementByOneQ4 {
	public int[] incrementByOne(int[] digits) {
		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {

			digits[i]++;

			if (digits[i] < 10) {
				return digits;
			}

			// If the digit is 10, set it to 0 and propagate the carry
			digits[i] = 0;
		}

		// If all digits are 0 and a carry is still needed, create a new array with

		int[] newDigits = new int[n + 1];
		newDigits[0] = 1;

		return newDigits;
	}

	public static void main(String[] args) {
		// Question 4
		int[] digits = { 1, 2, 3 };

		IncrementByOneQ4 solution = new IncrementByOneQ4();
		int[] result = solution.incrementByOne(digits);

		System.out.println("Output: " + Arrays.toString(result));
	}

}

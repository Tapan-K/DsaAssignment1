package in.ineuronAsignment1;
import java.util.HashSet;
import java.util.Set;

public class AppearTwiceQ6 {
	public boolean containsTwice(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        
        return false;
    }

	public static void main(String[] args) {
		// Question 6
		int[] nums = {1, 2, 3, 1};

		AppearTwiceQ6 solution = new AppearTwiceQ6();
        boolean result = solution.containsTwice(nums);

        System.out.println("Output: " + result);

	}

}

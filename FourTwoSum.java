package assignment;

import java.util.HashMap;
import java.util.Map;

public class FourTwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		// put all the nums from array to the Hashmap
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		// traverse the hashmap
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		return nums;
	}

}

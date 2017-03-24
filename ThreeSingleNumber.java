package assignment;

import java.util.HashMap;
import java.util.Map;

public class ThreeSingleNumber {
	public static void singleNumber(int[] nums) {                 //wrong(-3):do not change the return type required by the question. If the input is {2,2,1}, you print out {2,1}, but the answer is 1.
		Map<Integer, String> map = new HashMap<>();

		//put the numbers into Hashmap except the repeat nums
		for (int i = 0; i < nums.length; i++) {
			//define which numbers can have the value:twice
			if (map.containsKey(nums[i])) {
				map.put(nums[i], "twice");
			} 
			//define which numbers can have the value:once
			else {
				map.put(nums[i], "once");
			}
			
			//print the number whose value is once
			for (int s : map.keySet()) {
				if (map.get(s) == "once") {
					System.out.println(s);
				}
			}
		}
	}

	//main method
	public static void main(String args[]) {

		int[] nums = { 2, 2, 5, 4, 5, 6, 4 };
		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], "twice");
			} else {
				map.put(nums[i], "once");
			}
		}

		System.out.println(map.entrySet());

		for (int s : map.keySet()) {
			if (map.get(s) == "once") {
				System.out.println(s);
			}

		}

	}
}

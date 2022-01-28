package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
	/*
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target. You may assume that each input
	 * would have exactly one solution, and you may not use the same element twice.
	 * You can return the answer in any order.
	 * 
	 * Example 1: Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation:
	 * Because nums[0] + nums[1] == 9, we return [0, 1]. Example 2: Input: nums =
	 * [3,2,4], target = 6 Output: [1,2]
	 */
	public int[] twoSum(int[] nums, int target) {
		String result2 = "";
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					result2+= i+","+j;
				}
			}
		}
		String[] arr = result2.split(",");
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i]= Integer.parseInt(arr[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[]nums = {2,7,11,15};
		int target = 9;
		int[]nums2 = {3,2,4};
		int target2 = 6;
		int[]result = ts.twoSum(nums,target);
		int[]result2 = ts.twoSum(nums2,target2);
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
	}

}

package Sorting;

public class ThirdMaximumNumber {
	private static void printArray(int i, long[] ar) {
		System.out.print("i = " + i + ": ");
		for (int j = 0; j < ar.length; j++) {
			System.out.print(ar[j] + " ,");
		}
		System.out.println();
	}

	public static void insert(long[] arrMax, int val) {
		int i = 0;
		while (i < arrMax.length) {
			if (val == arrMax[i]) {
				// Khong duoc trung
				return;
			} else if (val > arrMax[i]) {
				// Chen val vao maxArr[i]
				break;
			} else { // val < maxArr
				i++;
			}
		}
		if (i < arrMax.length) {
			for (int j = arrMax.length - 2; j >= i; j--) {
				arrMax[j + 1] = arrMax[j];
			}
			arrMax[i] = val;
			printArray(i, arrMax);
		}
	}

	public static int thirdMax(int[] nums) {
		long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
		for (int i = 0; i < nums.length; i++) {
			insert(maxArr, nums[i]);
		}
		if (maxArr[2] == Long.MIN_VALUE) {
			return (int) maxArr[0];
		}

		return (int) maxArr[2];
	}
	public static void main(String[] args) {
		int[]a = {3,2,1};
		System.out.println(thirdMax(a));
	}
}

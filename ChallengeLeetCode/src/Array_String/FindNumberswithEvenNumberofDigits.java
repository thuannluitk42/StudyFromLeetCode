package Array;

public class FindNumberswithEvenNumberofDigits {

	private int countNumberOfDigit(int number) {
		int count = 0;// bien dem chu so
		int result = number;// gan gia tri ban dau
		while (result != 0) {
			result = number / 10;
			number = result;
			count++;
		}
		return count;
	}
	
    public int findNumbers(int[] nums) {
    	int count = 0;
        for (int i : nums) {
			if (countNumberOfDigit(i) % 2 == 0) {
				count++;
			}
		}
        return count;
    }
    
    public static void main(String[] args) {
		FindNumberswithEvenNumberofDigits f = new FindNumberswithEvenNumberofDigits();
		FindNumberswithEvenNumberofDigits f2 = new FindNumberswithEvenNumberofDigits();
		int[]nums = {12,345,2,6,7896};
		int[]nums2 = {555,901,482,1771};
		System.out.println("Answer: "+f.findNumbers(nums));
		System.out.println("Answer: "+f2.findNumbers(nums2));
	}
}

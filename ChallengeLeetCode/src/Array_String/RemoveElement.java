package Array;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		int n = nums.length;
		for (int i = 0; i < n;) {
			if (nums[i] == val) {
				// xoa phan tu a[i]
				for (int j = i; j < n - 1; j++) {
					nums[j] = nums[j + 1];
				}
				n--;// cap nhat lai so luong phan tu trog mang
			} else {
				i++;// khong phai xoa
			}
		}
		return n;
	}
	
	// dung 2 con tro
	public int removeElement2(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		System.out.println(re.removeElement(nums, val));
	}

}

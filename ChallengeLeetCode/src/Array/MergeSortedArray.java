package Array;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int ai : nums2) {
			insertElementIntoArray(ai, nums1, m);
			m++;
		}
	}

	private void insertElementIntoArray(int ai, int[] nums1, int m) {
		boolean isChanged = false;
		for (int i = 0; i < m; i++) {
			if (ai < nums1[i]) {// truong hop: neu phan tu mang 2 < mang 1
				isChanged = true;
				for (int j = m - 1; j >= i; j--) {//
					nums1[j + 1] = nums1[j];// dich phan tu trong mang a sang phai 1 don vi
				}
				nums1[i] = ai; // gan phan tu mang 2 vao mang 1, tai vi tri phan tu lon hon dau tien
				break;
			}
		}
		if (isChanged == false) { // truong hop: neu phan tu mang 2 > mang 1
			nums1[m] = ai;// dua phan tu mang 2 vao vi tri cuoi cung mang 1
		}
	}

	// Dung con tro
	public void merge2(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = (m + n) - 1;
		while (k >= 0) {
			if (j < 0) {
				nums1[k] = nums1[i];
				i--;
			} else if (i < 0) {
				nums1[k] = nums2[j];
				j--;
			} else if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
	}

	public static void main(String[] args) {
		MergeSortedArray msa = new MergeSortedArray();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3, n = 3;
		msa.merge(nums1, m, nums2, n);
	}
}

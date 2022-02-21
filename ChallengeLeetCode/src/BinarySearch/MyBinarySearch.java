package BinarySearch;

public class MyBinarySearch {
	// binary search dung vong lap
	public static int binarySearch(int[] a, int key) {
		int n = a.length;
		int iLeft = 0;
		int iRight = n - 1;
		while (iLeft <= iRight) {
			int iMid = (iLeft + iRight) / 2;
			System.out.println("[" + iLeft + "," + iRight + "] xet" + iMid);
			if (key == a[iMid]) {
				return iMid;
			} else if (key > a[iMid]) {
				iLeft = iMid + 1;
			} else {
				iRight = iMid - 1;
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int[] ar4 = { 1, 2, 3, 4, 5, 7, 8 };
		System.out.println(binarySearch(ar4, 5));
	}
}
